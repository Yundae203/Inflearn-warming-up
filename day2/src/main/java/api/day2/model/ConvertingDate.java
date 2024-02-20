package api.day2.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConvertingDate {

    private String dayOfTheWeek;

    public ConvertingDate(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }
}
