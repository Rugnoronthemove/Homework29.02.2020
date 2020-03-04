package homework29022020;

/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
Before the user enters the number, print the message •Enter number: •
If the user enters an invalid number, break out of the loop and print the minimum and
maximum number.
 */

import java.util.Scanner;

//not sure why but would not run

public class JP2 {

    public static void main(String[] args) {
        JP2 ins = new JP2();
        ins.minAndMax();
    }

    public void minAndMax() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number(to exit enter any leter): ");
            boolean isAnint = sc.hasNextInt();
            if (isAnint) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                } else {
                    break;
                }
            }
            System.out.println("Min: " + min + "Max: " + max);
            sc.close();
        }
    }
}
