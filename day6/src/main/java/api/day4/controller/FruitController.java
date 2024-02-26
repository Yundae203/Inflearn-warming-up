package api.day4.controller;


import api.day4.model.BuyFruitRequest;
import api.day4.model.FruitDto;
import api.day4.model.FruitPriceResultDto;
import api.day4.service.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fruit")
@RequiredArgsConstructor
public class FruitController {

    private final FruitService fruitService;

    @PostMapping
    public String saveFruit(@RequestBody FruitDto fruitDto) {
        fruitService.save(fruitDto);
        return "ok";
    }

    @PutMapping
    public String buyFruit(@RequestBody BuyFruitRequest buyFruitRequest) {
        fruitService.sell(buyFruitRequest.getId());
        return "ok";
    }

    @GetMapping("/stat")
    public FruitPriceResultDto readIncome(@RequestParam(name = "name") String name) {
        return fruitService.getSalesPrice(name);
    }
}
