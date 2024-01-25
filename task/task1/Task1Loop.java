package guvi.assessment.guvi.task.task1;

import java.util.Scanner;

public class Task1Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int n = s.nextInt();


        while (i <=n) {
            if(i%5==0)
            System.out.print(i+" ");
            i++;

        }


    }
}