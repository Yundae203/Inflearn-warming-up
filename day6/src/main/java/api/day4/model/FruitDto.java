package api.day4.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class FruitDto {
    private String name;
    private LocalDate warehousingDate;
    private Long price;
}
