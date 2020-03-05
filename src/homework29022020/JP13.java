package homework29022020;

/*
Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.
*/

public class JP13 {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9,8));

    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99)
            return false;
        while (n1 > 0) {
            int secondNumber = n2;
            int firstNumber = n1 % 10;
            while (secondNumber > 0) {
                if (firstNumber == secondNumber % 10) {
                    return true;
                }
                secondNumber /= 10;
            }
            n1 /= 10;
        }
        return false;
    }

}

