package api.day2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class NumbersRequest {
    private List<Integer> numbers;
}
