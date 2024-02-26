package api.day4.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Fruit {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDate warehousingDate;
    private Long price;
    @Enumerated(value = EnumType.STRING)
    private SalesState salesState;

    public Fruit(String name, LocalDate warehousingDate, Long price) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
        this.salesState = SalesState.SELLING;
    }

    public Fruit(FruitDto fruitDto) {
        this.name = fruitDto.getName();
        this.warehousingDate = fruitDto.getWarehousingDate();
        this.price = fruitDto.getPrice();
        this.salesState = SalesState.SELLING;
    }

    public void sellingFruit() {
        this.salesState = SalesState.SOLD;
    }

    public Long salesPrice() {
        if (this.salesState == SalesState.SOLD) {
            return this.price;
        }
        return 0L;
    }
}
