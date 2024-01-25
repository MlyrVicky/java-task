package guvi.assessment.guvi.task.task3.o2;

import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print("enter employeeId : ");
        int id = s.nextInt();
        System.out.print("enter employeeName : ");
        String name = s.nextLine();
        System.out.println(" ");
        System.out.print("enter Employee salary : ");
        double salary = s.nextDouble();
        System.out.println("\n");

        Employee employee = new Employee(id,name,salary);

        System.out.print("Enter Product Id : ");
        int  pId = s.nextInt();
        System.out.print("Enter ProductPrice : ");
        double p= s.nextDouble();

        System.out.print("Enter Product Quantity : ");
        int q = s.nextInt();
        System.out.println("\n");
        Product product = new Product(pId, p, q);

        employee.calcTax();
        product.calcTax();


    }
}
