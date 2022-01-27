package Problem.Solving.Beginner;

public class primeNumberb {
    private static boolean primeNumberb(int number) {
        //my code here
        int temp;
        for (int i = 2; i <= number; i++) {
            temp = number % i;
            if(temp == 0) {
                boolean primeNumberb = true;
                }
            else {
                boolean primeNumberb = false;
                break;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(primeNumberb(11));
        System.out.println(primeNumberb(13));
        System.out.println(primeNumberb(17));
        System.out.println(primeNumberb(20));
        System.out.println(primeNumberb(35));
    }
}
