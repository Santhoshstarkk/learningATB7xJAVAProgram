package Ex_07202724;

public class bank2 {
    public static void main(String[] args) {
        bank1 bal1=new bank1();
        bank1 bal2=new bank1();

        bal1.Name="TMB";
        bal1.balance=400;

        System.out.println(bal1.Name);
        System.out.println(bal1.balance);

        bal2.Name="HDFC";
        bal2.balance=120;


        System.out.println(bal2.Name);
        System.out.println(bal2.balance);

        bal1.deposit();
        bal1.balance=800;
        bal1.Withdraw();


        bal2.deposit();
        bal2.Withdraw();







    }
}
