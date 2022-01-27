package Problem.Solving.Beginner;

public class FaktorBilanganab {
    public static void main(String[] args) {
        int bilangan;
        bilangan = 20;
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
