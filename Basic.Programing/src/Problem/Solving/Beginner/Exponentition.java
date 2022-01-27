package Problem.Solving.Beginner;

public class Exponentition {
   private static double pangkat(int a, int b) {
    double hasil;
    hasil = Math.pow(a,b);
       System.out.println(hasil);

       return hasil;
   }
    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5, 3));
        System.out.println(pangkat(10, 2));
        System.out.println(pangkat(2, 5));
        System.out.println(pangkat(7, 3));
    }}
