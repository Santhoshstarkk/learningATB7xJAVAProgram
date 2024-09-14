package Poly.overriding;

public class Main {
    public static void main(String[] args) {
        Animal myanimal= new Animal();
        Animal MyDog= new Dog();
        Animal MyCat=new Cat();



        myanimal.sound();
        MyDog.sound();
        MyCat.sound();

    }
}
