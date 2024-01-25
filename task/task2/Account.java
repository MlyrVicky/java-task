package guvi.assessment.guvi.task.task2;

import java.util.Scanner;

public class Account {
    Double balance;

    Account() {
        this.balance = 0.0;
    }

    Account(double balance) {
        this.balance = balance;
    }

    void depositAmount(double deposit) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the deposit amount : ");
        deposit= s.nextDouble();
        if (deposit > 0.0) {

            balance += deposit;
            System.out.println("Amount deposit successfully");
        } else {
            System.out.println(" respite incorrect ");
        }
    }

    void withdraw() {
        Scanner s = new Scanner(System.in);


       balance = 1000.0;
        System.out.print("Enter the withdraw amount : ");
        balance = s.nextDouble()+balance;
        if (balance>=1000.0){

            System.out.println("amount withdraw successfully");
        }else{
            System.out.println(" bank balance below the limit ");
        }

    }

    public static void main(String[] args) {

           Account account = new Account(1000);
           Account account1 = new Account();
           account1.depositAmount(account1.balance);
           account1.withdraw();


    }
}
