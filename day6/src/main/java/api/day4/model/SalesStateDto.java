package api.day4.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SalesStateDto {

    private SalesState salesState;
    private Long price;

    public SalesStateDto(SalesState salesState, Long price) {
        this.salesState = salesState;
        this.price = price;
    }
}
