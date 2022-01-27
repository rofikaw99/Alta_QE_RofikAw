package pewarisan.animal;

public class Animal {
    public String NamaBinatangHerbivor;
    public String JenisMakanHerbivor;
    public String GigiBinatangHerbivor;
    public String NamaBinatangCarnivor;
    public String JenisMakanCarnivor;
    public String GigiBinatangCarnivor;
    public String NamaBinatangOmnivor;
    public String JenisMakanOmnivor;
    public String GigiBinatangOmnivor;

    public void go() {
        System.out.println("Hi I'am Parent of All Animal, My Name is Binatang");
    }
    public void stop() {
        System.out.println("Hi I'am Herbivor, My Name is "+NamaBinatangHerbivor+" My Food is "+JenisMakanHerbivor+" I Have "+GigiBinatangHerbivor+" Teeth");
        System.out.println("Hi I'am Carnivor, My Name is "+NamaBinatangCarnivor+" My Food is "+JenisMakanCarnivor+" I Have "+GigiBinatangCarnivor+" Teeth");
        System.out.println("Hi I'am Omnivor, My Name is "+NamaBinatangOmnivor+" My Food is "+JenisMakanOmnivor+" I Have "+GigiBinatangOmnivor+" Teeth");
    }
}
