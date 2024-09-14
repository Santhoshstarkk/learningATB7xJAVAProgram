package Poly.overloading;

public class Main {
    public static void main(String[] args) {
        MathOperation math=new MathOperation();

        System.out.println("Sum of 2 and 3 are :" +math.add(2,3));

        System.out.println("sum of 3 number" +math.add(2,2,2));

        System.out.println("sum of 2 double "+ math.add(2,2));

    }
}
