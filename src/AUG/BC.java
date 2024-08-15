package AUG;

public class BC {
    String bookName;
    String Auther;
    double price;

    public BC(String bookName,String Auther,double price) {
        this.bookName = bookName;
        this.Auther = Auther;
        this.price = price;
    }
        public void DetailDis(){
            System.out.println("Tile of the book is :" +bookName);
            System.out.println("Auther name is :"+Auther);
            System.out.println("price :"+price);

        }

    }



