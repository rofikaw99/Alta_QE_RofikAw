package pewarisan.animal;

public class ChildofAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.NamaBinatangHerbivor = "Kambing";
        animal.JenisMakanHerbivor = "Tumbuhan";
        animal.GigiBinatangHerbivor = "Tumpul";
        animal.NamaBinatangCarnivor = "Singa";
        animal.JenisMakanCarnivor = "Daging";
        animal.GigiBinatangCarnivor = "Tajam";
        animal.NamaBinatangOmnivor = "Ayam";
        animal.JenisMakanOmnivor = "Semua";
        animal.GigiBinatangOmnivor = "Tajam";

        animal.go();
        animal.stop();

    }
}
