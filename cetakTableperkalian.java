package Problem.Solving.Beginner;

public class cetakTableperkalian {
    private static void cetakTableperkalian(int n) {
        String tabelnya = " Cetak Tabel Perkalian \n";
        tabelnya += "************************\n";

        for (int i = 1; i <= 9; i++) {
            tabelnya += i + " | ";
            for (int j = 1; j <= 9; j++) {
                if (i * j < 10) {
                    tabelnya += " " + i * j;
                } else {
                    tabelnya += " " + i * j;

                }
            }
            tabelnya += "\n";
        }
        System.out.println(tabelnya);
    }
    public static void main(String[] args) {
        cetakTableperkalian(3);
    }
}

