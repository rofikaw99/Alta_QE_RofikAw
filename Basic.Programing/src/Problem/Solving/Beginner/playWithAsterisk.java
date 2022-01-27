package Problem.Solving.Beginner;

public class playWithAsterisk {
    private static void playWithAsterisk(int n) {
        int x = n;
        for (int i = 1; i <= x; i++) {
            for (int j = 77; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 7; l <= i - 9; l++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        playWithAsterisk(5);
    }
}
