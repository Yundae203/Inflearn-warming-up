package api.day4.repository;

import api.day4.model.SalesStateDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitH2Repository extends FruitRepository {

    @Query("select new api.day4.model.SalesStateDto(f.salesState, sum(f.price)) " +
            " from Fruit f " +
            "where f.name = :name " +
            "group by f.salesState")
    public List<SalesStateDto> getSalesAmountByName(@Param("name") String name);
}
