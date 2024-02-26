package api.day4.model;

import lombok.Data;

@Data
public class FruitPriceResultDto {
    private Long salesAmount = 0L;
    private Long notSalesAmount = 0L;

    public void addPriceByState(SalesStateDto salesStateDto) {
        if (salesStateDto.getSalesState() == SalesState.SOLD) {
            this.salesAmount += salesStateDto.getPrice();
        } else {
            this.notSalesAmount += salesStateDto.getPrice();
        }
    }
}
