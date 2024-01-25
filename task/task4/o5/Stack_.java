package guvi.assessment.guvi.task.task4.o5;

import java.util.Scanner;

public class Stack_ {
    Scanner s;
    java.util.Stack<Integer> stack = new java.util.Stack<>();

    void pushingElement() {

        System.out.println("pushingElement :");
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println(stack);
        System.out.println("\n");
    }

    void poppingElement() {
        System.out.println("poppingElement :");
        System.out.println(stack.pop());
        System.out.println("\n");

    }

    void checkIsEmpty() {

        System.out.println("stack is empty : " + stack.isEmpty());
        System.out.println("\n");
    }



    public static void main(String[] args) {
        Stack_ stack1 = new Stack_();

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("operations : ");
            System.out.println("1.pushing Elements :");
            System.out.println("2.popping Elements :");
            System.out.println("3.checking stack is empty :");
            System.out.println("4.scanner close : ");
            System.out.println("\n");

            System.out.print("Enter Number : ");
            int n = s.nextInt();
            switch (n) {

                case 1:
                    stack1.pushingElement();
                    break;

                case 2:
                    stack1.poppingElement();
                    break;
                case 3:
                    stack1.checkIsEmpty();
                    break;
                case 4:
                    System.out.println("Scanner close successfully ");
                    s.close();
                    System.exit(0);
                    break
                            ;
            }
        }
    }

}
