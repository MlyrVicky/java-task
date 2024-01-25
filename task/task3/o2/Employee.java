package guvi.assessment.guvi.task.task3.o2;

public class Employee implements Taxable {
    private int employeeId ;
    private String name ;
    private double salary ;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double totalIncomeTax = salary*incomeTax;
        System.out.println("EmployeeId : " +employeeId+"\n"+"EmployeeName : " +name +"\n"+"salary : "+salary+"\n"+"IncomeTax : " +totalIncomeTax);
        System.out.println("\n");

    }

}


