package AUG;

public class bookc {
    public static void main(String[] args) {
        book B=new book();
        B.title="THE NEW BEGINING";
        B.author="SANDY";
        B.price=100;

        book b1 =new book();
        b1.title="travel through";
        b1.author="sandy";
        b1.price=200;


        B.disDetails();
        B.applyDiscount(10);

        b1.disDetails();
        b1.applyDiscount(5);






    }

}
