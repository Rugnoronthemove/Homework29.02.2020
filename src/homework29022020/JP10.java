package homework29022020;

/*
Write a program to input any number and check if it Armstrong number or not
 */

import java.util.Scanner;

public class JP10 {

    public static void main(String[] args) {
        armstrongNumbers();
    }

    public static void armstrongNumbers() {
        int num, number, temp, total = 0;

        System.out.println("Enter any Three Digit Number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        number = num;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }
        if (total == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}