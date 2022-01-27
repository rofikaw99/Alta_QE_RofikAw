package Problem.Solving.Beginner;

public class DrawXYZ {
    private static void DrawXYZ(int n) {
        String X = null, Y, Z = null;
        if (X == String.valueOf(n % 2)) {
            System.out.println("X");
        }
        else if (Z == String.valueOf(n ^ 3)) {
            System.out.println("Z");
        }
        else {
            System.out.println("Y");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DrawXYZ(3);
        /*
        X Y Z
        Z Y X
        Y Z X
         */

        DrawXYZ(5);
        DrawXYZ(1);
    }
}
