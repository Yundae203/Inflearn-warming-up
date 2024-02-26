package api.day4.repository;


import api.day4.model.Fruit;
import api.day4.model.SalesStateDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

    List<SalesStateDto> getSalesAmountByName(String name);

}
