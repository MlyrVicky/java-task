package guvi.assessment.guvi.task.task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int b = s.nextInt();

        int c = s.nextInt();

        if(a < b && a < c)
        {
            System.out.println("The smallest number is: "+a);
        }
        else if(b < c)
        {
            System.out.println("The smallest number is: "+b);
        }
        else
        {
            System.out.println(" The smallest number is: "+c);
        }

    }
}