package com.company;

public class Kalkulator {
    private static double Penjumlahan(int a, int b) {
        double Penjumlahan = a + b;

        return Penjumlahan;
    }
    private static double Pengurangan(int a, int b) {
        double Pengurangan;
        Pengurangan = a - b;

        return Pengurangan;
    }
    private static double Perkalian(int a, int b) {
        double Perkalian;
        Perkalian = a * b;

        return Perkalian;
    }
    private static double Pembagian(int a, int b) {
        double Pembagian;
        Pembagian = a / b;

        return Pembagian;
    }



    public static void main(String[] args) {
        System.out.println(Penjumlahan(3,4));
        System.out.println(Pengurangan(15, 4));
        System.out.println(Perkalian(10, 10));
        System.out.println(Pembagian(12, 3));

    }

}
