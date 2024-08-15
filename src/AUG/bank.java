package AUG;

public class bank {
    String BankName;
    String IfscCode;
    double balance;

      bank(){
        this.BankName ="SBI";
        this.IfscCode="SBIII";
        this.balance=2000;
    }
    void disdet() {
        System.out.println("bank name:" + BankName);
        System.out.println("Ifsc code:" + IfscCode);
        System.out.println(" balance :" + balance);
    }

        bank(String BankName,String IfscCode,double balance){
        this.BankName=BankName;
        this.IfscCode=IfscCode;
        this.balance=balance;

    }


    }




