package Problem.Solving.Beginner;

public class Palindrome {
    private static boolean Palindrome(String value) {
        var value1 = "civic";
        var value2 = "katak";
        var value3 = "kasur rusak";
        var value4 = "kupu-kupu";
        var value5 = "lion";

        int i;
        for (i = value.length() - 1; i >= 0; i--) {
            value.charAt(i);
            System.out.println(value.charAt(i));
        }
        return false || true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome("civic"));
        System.out.println(Palindrome("katak"));
        System.out.println(Palindrome("kasur rusak"));
        System.out.println(Palindrome("kupu-kupu"));
        System.out.println(Palindrome("lion"));
    }
}
