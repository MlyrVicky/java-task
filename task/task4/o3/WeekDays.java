package guvi.assessment.guvi.task.task4.o3;

import java.util.Scanner;

public class WeekDays extends Exception {
    public static void main(String[] args) {
        String arr[] = new String [10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            System.out.println("day : " + i);


            System.out.print("Enter dayName : ");
            String name = s.nextLine();

            arr[i] = name;

            if (i > 6) {
                throw new IndexOutOfBoundsException();
            }
        }


    }
}
