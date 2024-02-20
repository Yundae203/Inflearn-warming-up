package api.day2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class CalcRequest {
    private Integer num1;
    private Integer num2;

    public List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(this.num1);
        numbers.add(this.num2);
        return numbers;
    }
}
