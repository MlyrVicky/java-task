package guvi.assessment.guvi.task.task1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n <= 500) {
            System.out.println("no discount is applied ");
        } else if (n > 500 && n <= 1000) {
            System.out.println("10% discount is applied ");
        } else if (n > 1000) {
            System.out.println("20% discount is applied ");
        }

    }
}
