package homework29022020;

/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class JP3 {

    public static void main(String[] args) {
        //JP3 ins = new JP3();
        //ins.lengthOfString();
        vowelOrConsonant();
    }

    public static void vowelOrConsonant() {
        System.out.println("Input an alphabets from A to Z: ");
        Scanner sc1 = new Scanner(System.in);
        char ch = sc1.nextLine().charAt(0);
        if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') || (ch == 'a' || ch ==
                'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
            System.out.println("Input alphabet " + ch + " is a Vowel");
        } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Input alphabet " + ch + " is a Consonant");
        } else {
            System.out.println("Invaid Input");
        }
        sc1.close();
    }

}
