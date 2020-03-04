package homework29022020;

/*Read 10 numbers from the console
entered by the user and print the sum of those numbers.*/

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        System.out.println(hasNext());
    }

    public static boolean hasNext() {

        //boolean n;
        //String s = "Enter next Int number: ";
        Scanner sc = new Scanner(System.in);
        int num;
        double sum = 0;
        int i = 1;
        System.out.println("Enter number: ");
        int en = sc.nextInt();
        while (i <= en) {
            System.out.println("Enter number#" + i);
            num = sc.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println("The Total is: " + sum);
        return true;
    }

}

