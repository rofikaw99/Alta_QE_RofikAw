package com.company;

public class MenghitungVolume {
    private static double VolumeKubus(int SisiKubus) {
        double VolumeKubus = SisiKubus * SisiKubus * SisiKubus;
        return VolumeKubus;
    }
    private static double VolumeBalok(int PanjangBalok, int LebarBalok, int TinggiBalok) {
        double VolumeBalok = PanjangBalok * LebarBalok * TinggiBalok;
        return VolumeBalok;
    }
    private static double VolumeTabung(int Jarijari, int TinggiTabung) {
        final float Phi = (float) 3.14159265358979323846;
        double VolumeTabung = Phi * (Jarijari*Jarijari) * TinggiTabung;
        return VolumeTabung;
    }

    public static void main(String[] args) {
        System.out.println(VolumeKubus(10));
        System.out.println(VolumeBalok(3, 6, 10));
        System.out.println(VolumeTabung(7, 10));
    }}
