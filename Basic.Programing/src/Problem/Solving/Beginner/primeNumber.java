package Problem.Solving.Beginner;

public class primeNumber {
    private static boolean primeNumber(int number) {
        //my code here
        for (int i = 2; i <= number; i++) {
            if ( number % i == 0) {
                boolean primeNumber = true;
            }
            else {
                boolean primeNumber = false;
                break;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }

}
