package guvi.assessment.guvi.task.task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TQ3 {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("Ramesh","Vinoth","athi","Ambiga","Anu","Hema","Litharchana","Andal","Velmurugan","Aravind");

       List<String >list1 = list.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println(list1);
    }
}
