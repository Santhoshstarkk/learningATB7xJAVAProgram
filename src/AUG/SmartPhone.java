package AUG;

public class SmartPhone {
     String brand;
     String Model;
     int Price;

     public SmartPhone(){
         brand ="samsung";
         Model="2020";
         Price =10000;
     }
     public  SmartPhone(String brand , String Model, int Price){
         this.brand=brand;
         this.Model=Model;
         this.Price=10000;

     }
     void DisDetail(){
         System.out.println("Brand is :" +brand);
         System.out.println("Model is :" +Model);
         System.out.println("price is :" +Price);

     }




}
