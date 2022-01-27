package Problem.Solving.Beginner;

import java.sql.SQLOutput;

//Konversi Nilai
public class KonversiNilai {
    public static void main(String[] args) {
        int studentScore;
        studentScore = 80;
        if (studentScore >= 80) {
            System.out.println("A");
        } else if (studentScore >= 65) {
            System.out.println("B+");
        } else if (studentScore >= 50) {
            System.out.println("B");
        } else if (studentScore >= 35) {
            System.out.println("C");
        } else if (studentScore >= 0) {
            System.out.println("D");
        } else if (studentScore < 0) {
            System.out.println("Invalid");
        } else if (studentScore > 100) {
            System.out.println("Invalid");
        }
    }
}
