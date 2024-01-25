package guvi.assessment.guvi.task.task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //write the program given number input number positive or negative


        Scanner s = new Scanner(System.in);

        int input = s.nextInt();


        if(input>0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
