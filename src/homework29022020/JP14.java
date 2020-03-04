package homework29022020;

/* Write a program in Java to display the pattern like a diamond.
   While loop
         *
        ***
       *****
      *******
     *********
    ***********
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/

import java.util.Scanner;

public class JP14 {

    public static void main(String[] args) {
        diamondWhileLoop();
    }

    public static void diamondWhileLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter Symbol");
        char c = sc.next().charAt(0);
        sc.close();
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
    }

}


