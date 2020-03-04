package homework29022020;

    /*Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@
    */

public class JP8 {

    public static void main(String[] args) {
        rightAngleTriangle();
    }

    public static void rightAngleTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 0; j++) {
                System.out.print("");
            }
            for (int s = 0; s < (i * 1 - 0); s++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
