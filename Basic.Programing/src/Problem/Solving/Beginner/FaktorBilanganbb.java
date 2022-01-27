package Problem.Solving.Beginner;

public class FaktorBilanganbb {
    public static void main(String[] args) {
        int bilangan;
        bilangan = 20;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(bilangan/i);
            }
        }
    }
}
