package com.company;

public class MenghitungLuasKeliling {
        private static double LuasPersegi(int SisiPersegi) {
            double LuasPersegi = SisiPersegi * SisiPersegi;
            return LuasPersegi;
        }
        private static double LuasSegitiga(int AlasSegitiga, int TinggiSegitiga) {
        double LuasSegitiga = 0.5 * AlasSegitiga * TinggiSegitiga;
        return LuasSegitiga;
        }
        private static double LuasPersegiPanjang(int PanjangPersegiPanjang, int LebarPersegiPanjang) {
        double LuasPersegiPanjang = PanjangPersegiPanjang * LebarPersegiPanjang;
        return LuasPersegiPanjang;
        }
        private static double KelilingPersegi(int SisiPersegi) {
        double KelilingPersegi = SisiPersegi + SisiPersegi + SisiPersegi + SisiPersegi;
        return KelilingPersegi;
        }
        private static double KelilingSegitiga(int AlasSegitiga, int TinggiSegitiga) {
        double SisiLainSegitiga = Math.sqrt((AlasSegitiga*AlasSegitiga)+(TinggiSegitiga*TinggiSegitiga));
        double KelilingSegitiga = AlasSegitiga + TinggiSegitiga + SisiLainSegitiga;
        return KelilingSegitiga;
        }
        private static double KelilingPersegiPanjang(int PanjangPersegiPanjang, int LebarPersegiPanjang) {
            double KelilingPersegiPanjang = PanjangPersegiPanjang + LebarPersegiPanjang + PanjangPersegiPanjang + LebarPersegiPanjang;
            return KelilingPersegiPanjang;
        }

        public static void main(String[] args) {
        System.out.println(LuasPersegi(4));
        System.out.println(LuasSegitiga(3, 4));
        System.out.println(LuasPersegiPanjang(7,8));
        System.out.println(KelilingPersegi(4));
        System.out.println(KelilingSegitiga(3,4));
        System.out.println(KelilingPersegiPanjang(7,8));
        }
}
