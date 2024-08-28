package AUG;

public class Laptop {
 String Brand;
 String Model;
 int year;

 public  Laptop(){
    Brand ="HP";
      Model="Standard";
      year =2021;

 }
  Laptop (String Brand, String model,int year){
   this.Brand=Brand;
   this.Model=model;
   this.year=year;

 }
 void Display(){
  System.out.println( "Brand is :"  +Brand);
  System.out.println("Model is :"  +Model);
  System.out.println("year is :"  +year);

 }




}
