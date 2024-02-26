package api.day4.repository;

import api.day4.model.SalesStateDto;

import java.util.List;

public interface FruitMemoryRepository extends FruitRepository {
    @Override
    public List<SalesStateDto> getSalesAmountByName(String name);
}
