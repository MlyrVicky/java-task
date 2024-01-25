package guvi.assessment.guvi.task.task2;

import java.util.Scanner;

public class Person {

    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Person p = new Person(s.nextLine(),18);

        p.display(p.name,p.age);

    }


    void display(String name, int age) {
        String n = this.name = name;
        int a = this.age = age;
        System.out.println(n);
        System.out.println(a);


    }


}
