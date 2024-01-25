package guvi.assessment.guvi.task.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TQ2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> check = list.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
        System.out.println(check);

    }
}

