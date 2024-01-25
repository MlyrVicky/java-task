package guvi.assessment.guvi.task.task4.o4;

import java.util.*;

public class Student {

    HashMap<String, Integer> hashMap = new HashMap<>();


    Scanner s1 = new Scanner(System.in);


    //add  new student

    void addStudent() {
        s1 = new Scanner(System.in);
        System.out.println("Add Student:-");
        System.out.print("Enter StudentName : ");
        String studentName = s1.nextLine();
        System.out.print("Enter Grad : ");
        int grad = s1.nextInt();
        hashMap.put(studentName, grad);
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
    }

    // remove student
    void removeStudent() {
        s1 = new Scanner(System.in);
        System.out.print("Enter StudentName : ");
        String name = s1.nextLine();
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
        if (!hashMap.containsKey(name)) System.out.println("Record Not found ");
        for (Map.Entry<String, Integer> entry : entryset) {
            if (name.contains(entry.getKey())) {
                hashMap.remove(entry.getKey());
                System.out.println("Record Remove Successfully ");
                break;
            }
        }

        System.out.println("\n");
    }

    // display student name and grade

    void displayStudentNameAndGrad() {
        s1 = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String studentName = s1.nextLine();
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entryset) {
            if (studentName.equals(entry.getKey())) {
                System.out.println("StudentName : " + entry.getKey() + "\nGrad : " + entry.getValue());
            }
        }
        if (!hashMap.containsKey(studentName)) System.out.println("Record Not Found");
        System.out.println("\n");
    }

    // display all student name and grad
    void displayAll() {
        Set<Map.Entry<String, Integer>> entryset = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entryset) {
            System.out.println("name : " + entry.getKey() + " " + " grad : " + entry.getValue());
        }

        System.out.println("\n");
    }

    void closeScanner() {
        System.out.println("Scanner close successfully ");
        s1.close();
        System.exit(0);
    }

}



