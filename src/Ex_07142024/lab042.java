package Ex_07142024;

public class lab042 {
    public static void main(String[] args) {
        String name ="The testing academy";
        String name1="The testing academy";

        String name2=new String("The testing academy");
        String name3=new String("The testing academy");

        System.out.println(name==name1); /// Check for reference
        System.out.println(name.equals( name1));


    }
}
