package AUG;

public class lapMain {
    public static void main(String[] args) {
        Laptop lap =new Laptop();
        lap.Display();

        System.out.println();

        Laptop lap2=new Laptop("Dell","Gamming",2024);
         lap2.Display();

         Laptop lap3 =new Laptop("mac","working",2026);
        lap3.Display();
    }
}
