package api.day4.model;

import lombok.Getter;

@Getter
public enum SalesState {
    SELLING("selling"), SOLD("sold");

    private final String state;

    private SalesState(String state) {
        this.state = state;
    }
}
