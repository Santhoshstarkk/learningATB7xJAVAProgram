package AUG;

public class book {
    String title;
    String author;
    double price;


    void disDetails(){
        System.out.println("Tile of book is :"+title);
        System.out.println("auther of the book is :"+author);
        System.out.println("Price of the book is :"+price);

    }
    void applyDiscount(double percentage){
    double dicountAmount= price*(percentage/100);
    price=price-dicountAmount;
        System.out.println("Price after applying "+percentage+"discont is"+price);


    }


}
