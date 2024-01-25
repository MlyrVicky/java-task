package guvi.assessment.guvi.task.task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TQ4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateString = scanner.nextLine();

        // Parse the input string to create a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateString);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        // Display the calculated age
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");


        scanner.close();
    }
}