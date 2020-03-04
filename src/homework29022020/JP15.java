package homework29022020;

/* Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class JP15 {

    public static void main(String[] args) {
        JP15 ins = new JP15();
        ins.leftangletriangle();

    }

    public void leftangletriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 0; j++) {
                System.out.print("");
            }
            for (int s = 0; s < (i * 1 - 0); s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
