package guvi.assessment.guvi.task.task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

      /*  String n = s.nextLine();
        StringBuffer stringBuffer = new StringBuffer(n);
        System.out.println(stringBuffer.reverse());
    }*/

        int n = s.nextInt();
        reverse(n);
        System.out.print(rev);
    }


    static int rev = 0;

    // Function to reverse the number
    static void reverse(int n) {

        if (n <= 0)
            return;
        // remainder
        int rem = n % 10;
        rev = (rev * 10) + rem;
        reverse(n / 10);
    }
}