package com.company;

public class OngkosKirim {
    private static boolean DimensiBarang(int panjang, int lebar, int tinggi, int berat) {

        if (panjang * lebar * tinggi * berat <= 50) {
            System.out.println("Rp 5000");
        }

        return true;
    }

    public static void main(String[] args) {
        DimensiBarang(5,2, 4, 1 );
}}
