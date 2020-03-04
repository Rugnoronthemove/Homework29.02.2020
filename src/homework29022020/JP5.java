package homework29022020;

/*
Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
 */

public class JP5 {

    public static void main(String[] args) {
        JP5 ins = new JP5();
        System.out.println(ins.isPalindrome(-5125));

    }

    public boolean isPalindrome(int number) {
        int rev = 0;
        if (number < 0) {
            number *= -1;
        }
        int num = number;
        while (num > 0) {
            int lastDigit = num % 10;
            rev *= 10;
            rev += lastDigit;
            num /= 10;
        }
        //System.out.println(number);
        //System.out.println(rev);
        if (rev == number) {
            return true;
        } else {
            System.out.println(false + " because reverse is " + rev + " and that is not equal to or same as " + number);
        }
        return false;
    }
}


