package guvi.assessment.guvi.task.task4.O2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Voter extends Exception {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;

    }

    void checkAge(int age) throws InvalidAgeForVoter {
        this.age = age;
        if (age < 18) {
            throw new InvalidAgeForVoter(" Invalid Age For Voter ");
        }
    }

    public static void main(String[] args) throws InvalidAgeForVoter {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter VoterId Number : ");
        int voterId = s.nextInt();

        System.out.print("Enter Name : ");
        String name = s.nextLine();
        s.nextLine();


        System.out.print("Enter age : ");
        int age = s.nextInt();

        Voter voter = new Voter(voterId, name, age);

        voter.checkAge(age);
    }
}
