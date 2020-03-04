package homework29022020;

/*
   First And Last Digit Sum
   Write a method named sumFirstAndLastDigit with one parameter of type int called number.
   The method needs to find the first and the last digit of the parameter number passed to
   the method, using a loop and return the sum of the first and the last digit of that number.
   If the number is negative then the method needs to return -1 to indicate an invalid value.
*/

public class JP7 {

    public static void main(String[] args) {
        sumFirstAndLastDigit(19);
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit;
        int lastDigit;

        firstDigit = number % 10;
        if (number < 0) {
            number = -1;
            System.out.println(number + " As the number entered is negative");
            return number;
        } else if (number >= 0 && number < 10) {
            lastDigit = number;
            System.out.println("The first digit and last digit is " + firstDigit + " since we only have 1 digit which gives us " + lastDigit + "+" + firstDigit + " and the sum is " + (lastDigit + firstDigit));
            return number;
        }
        while (number >= 10) {
            number = number / 10;
        }
        lastDigit = number;
        System.out.println("The first digit is " + lastDigit + " and the last digit is " + firstDigit + " which gives us " + lastDigit + " + " + firstDigit + " and the sum is " + (lastDigit + firstDigit));
        return number;
    }
}
