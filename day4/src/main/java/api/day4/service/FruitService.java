package api.day4.service;

import api.day4.model.*;
import api.day4.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;

    @Transactional
    public void save(FruitDto fruitDto) {
        fruitRepository.save(new Fruit(fruitDto));
    }

    @Transactional
    public void sell(Long fruitId) {
        Fruit findFruit = fruitRepository.findById(fruitId).orElse(null);
        if (findFruit == null) {
            throw new IllegalArgumentException("등록되지 않은 과일입니다.");
        }
        if (findFruit.getSalesState() == SalesState.SOLD) {
            throw new IllegalArgumentException("이미 판매된 과일입니다.");
        }
        findFruit.sellingFruit();
    }

    public FruitPriceResultDto getSalesPrice(String name) {
        List<SalesStateDto> salesStateDTOs = fruitRepository.getSalesAmountByName(name);
        FruitPriceResultDto fruitPriceResultDto = new FruitPriceResultDto();

        for (SalesStateDto salesStateDto : salesStateDTOs) {
            fruitPriceResultDto.addPriceByState(salesStateDto);
        }
        return fruitPriceResultDto;
    }
}
