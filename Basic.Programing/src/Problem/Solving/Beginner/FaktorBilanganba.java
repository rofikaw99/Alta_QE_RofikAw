package Problem.Solving.Beginner;

public class FaktorBilanganba {
    public static void main(String[] args) {
        int bilangan;
        bilangan = 6;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(bilangan/i);
            }
        }
    }
}
