package guvi.assessment.guvi.task.task3.o1;

import java.util.Scanner;

public class Library {
    Scanner s = new Scanner(System.in);

    private Books[] books;

    public Library() {
        this.books = new Books[5];
    }


    // method to add book
    void addbook() {
        for (int i = 0; i < books.length; i++) {


            System.out.print("Book : " + (i + 1));
            System.out.println();
            System.out.print("enter book id : ");
            int bId = s.nextInt();
            s.nextLine();

            System.out.print("enter book name : ");
            String bookName = s.nextLine();

            System.out.print("enter the author Name : ");
            String artherName = s.nextLine();

            System.out.print("enter is true or false : ");
            boolean b = s.nextBoolean();
            System.out.println("\n");

            books[i] = new Books(bId, bookName, artherName, b);

        }

    }

    void removeBook() {

        System.out.println(" Enter book id : ");
        int id = s.nextInt();
        boolean b = false;
        for (int i = 0; i < books.length; i++) {

            if (id == books[i].getBookId()) {
                books[i] = new Books(0, "", "", false);
                System.out.println("value set in null  ");
                b = true;
            }
        }
        if (!b) {
            System.out.println("record not found ");
        }
        System.out.println("\n");
    }


    // method to display book
    void display() {

        System.out.println("Enter book id : ");
        int bookId = s.nextInt();
        boolean b = false;

        for (Books book : books) {
            if (bookId == book.getBookId()) {
                System.out.println(book);
                b = true;

            }
        }
        if (!b) {
            System.out.println("record not found ");
        }
        System.out.println("\n");
    }


    //method to delete book

    void displayAllBook() {

        for (Books book : books) {
            System.out.println(book);

        }
        System.out.println("\n");
    }

    void scannerClose() {
        System.out.println("Scanner close successfully ");
        s.close();
        System.exit(0);

    }

    void replaceBookValue() {
        System.out.print("enter id : ");
        int replaceValue = s.nextInt();

        boolean b = false;
        for (int i = 0; i < books.length; i++) {
            if (replaceValue == books[i].getBookId()) {
                System.out.print("set book name : ");
                s.nextLine();
                books[i].setTitle(s.nextLine());

                System.out.print("set author name :");
                books[i].setAuthor(s.nextLine());

                System.out.print("set is book is true or false : ");
                books[i].setAvailable(s.nextBoolean());
                b = true;

            }
        }

        if (!b) {
            System.out.println("record not found ");
        }
        System.out.println("\n");
    }


}
