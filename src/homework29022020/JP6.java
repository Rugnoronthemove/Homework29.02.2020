package homework29022020;

/*
    Write a program in Java to display the pattern like triangle with a number.
    For eg.
    Input number of rows: 10
    Expected Output:
    1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910
 */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class JP6 {

    public static void main(String[] args) {
        JP6 ins = new JP6();
        ins.rightAngleTriangleWithNumbers();
    }

    public void rightAngleTriangleWithNumbers() {
        int a, b, c;
        System.out.print("Input number of rows: ");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        sc.close();
        for (a = 1; a <= c; a++) {
            for (b = 1; b <= a; b++)
                System.out.print(b);

            //for (c = 1; c <= b ; c++) {
            System.out.println();
        }
        //System.out.println();
    }
}



