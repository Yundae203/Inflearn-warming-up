package casino;

import java.util.HashMap;
import java.util.Map;

public class MemoPad implements Note {

    private final Map<Integer, Integer> page = new HashMap<>();

    @Override
    public void record(Integer number) {
        page.put(number, page.getOrDefault(number, 0) + 1);
    }

    @Override
    public void printTheResult() {
        for(Map.Entry<Integer, Integer> number : page.entrySet()){
            System.out.printf("%d은(는) %d번 나왔습니다.\n", number.getKey(), number.getValue());
        }
    }
}
