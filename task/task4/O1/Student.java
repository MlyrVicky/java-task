package guvi.assessment.guvi.task.task4.O1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private int rollNumber;
    private String name;

    private int age;

    private String course;

    public Student(int rollNumber, String name, int age, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void ageHandleExeption(int age) throws AgeNotWithinTheRangeException {
        this.age = age;
        if (!(age >= 15 && age <= 21)) {
            throw new AgeNotWithinTheRangeException("AgeNotWithinTheRangeException");
        }



    }

    void nameNotValidException(String name) throws NameNotValidException {
        this.name = name;

        String pattern ="[aA-zZ]";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(name);

         while (!matcher.find()){
             throw new NameNotValidException("NameNotValidException");
         }




    }

    public static void main(String[] args) throws AgeNotWithinTheRangeException, NameNotValidException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter RollNumber : ");
        int enterRollNumber = s.nextInt();
        System.out.print("Enter Name : ");

        String name = s.nextLine();
        s.nextLine();
        System.out.print("Enter Age : ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Enter Course Name : ");
        String courseName = s.nextLine();

        Student student = new Student(enterRollNumber, name, age, courseName);

        student.ageHandleExeption(age);
        student.nameNotValidException(name);


    }
}
