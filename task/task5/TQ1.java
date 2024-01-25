package guvi.assessment.guvi.task.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TQ1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aBc", "d", "ef");

        List<String> n = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        for (String s : n) {
            System.out.print(s+ " ");
        }
    }
}





