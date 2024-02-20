package api.day2.controller;

import api.day2.model.CalcRequest;
import api.day2.model.CalcResponse;
import api.day2.model.ConvertingDate;
import api.day2.model.NumbersRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Day2Controller {

    @GetMapping("/calc")
    public CalcResponse calc(@ModelAttribute CalcRequest calcRequest) {
        CalcResponse response = new CalcResponse();

        response.setAdd(addNumbers(calcRequest.getNumbers()));
        response.setMinus(minusNumbers(calcRequest.getNumbers()));
        response.setMultiply(multiplyNumbers(calcRequest.getNumbers()));

        return response;
    }

    @GetMapping("/day-of-the-week")
    public ConvertingDate dateConverter(@RequestParam LocalDate date) {
        return new ConvertingDate(date.getDayOfWeek().toString());
    }

    @PostMapping("/calc")
    public Integer addNumbers(@RequestBody NumbersRequest numbersRequest) {
        return addNumbers(numbersRequest.getNumbers());
    }

    public Integer addNumbers(List<Integer> numbers) {
        Integer result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return result;
    }

    public Integer minusNumbers(List<Integer> numbers) {
        Integer result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result -= numbers.get(i);
        }
        return result;
    }

    public Integer multiplyNumbers(List<Integer> numbers) {
        Integer result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result *= numbers.get(i);
        }
        return result;
    }

}
