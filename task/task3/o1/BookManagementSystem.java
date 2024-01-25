package guvi.assessment.guvi.task.task3.o1;

import java.util.Scanner;


public class BookManagementSystem {


    public static void main(String[] args) {


        Library library = new Library();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 add book : ");
            System.out.println("Enter 2 remove book : ");
            System.out.println("Enter 3 display book  : ");
            System.out.println("Enter 4 display all  book : ");
            System.out.println("Enter 5 close Scanner : ");
            System.out.println("Enter 6 replace book value : ");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("\n" + "Enter number : ");

            int n = s.nextInt();

            switch (n) {
                case 1:
                    library.addbook();

                    break;

                case 2:
                    library.removeBook();
                    break;

                //   remove book
                case 3:
                    library.display();
                    break;

                //    //method to total book
                case 4:
                    library.displayAllBook();
                    break;

                //    //method to delete book
                case 5:
                    library.scannerClose();
                    break;

                case 6:
                    library.replaceBookValue();
                    break;
            }


        }


    }


}
