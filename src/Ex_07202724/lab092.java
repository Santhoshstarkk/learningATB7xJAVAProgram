package Ex_07202724;

public class lab092 {
    public static void main(String[] args) {

        int[] salaries=new int[]{7,10,4,13,25,18,9,11};

        int max = salaries[0];
        int min =salaries[0];

        for (int i = 0; i <salaries.length ; i++) {
            if (salaries[i] > max) {
                 max=salaries[i];

            }


        }System.out.println ("max salary is :"+ max +"lpa");
        System.out.println( "minimum salary is :"+min +"lpa");
}
}
