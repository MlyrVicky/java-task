package guvi.assessment.guvi.task.task4.o4;

import java.util.Scanner;

public class SudentMarkManagement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student student = new Student();

        while (true) {

            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Display All Student");
            System.out.println("5. Close the Scanner");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");


            System.out.print("Choose Option : ");
            int n = s.nextInt();

            switch (n) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.removeStudent();
                    break;
                case 3:
                    student.displayStudentNameAndGrad();
                    break;
                case 4:

                    student.displayAll();
                    break;
                case 5:
                    student.closeScanner();
                    break;

            }



        }


    }
}
