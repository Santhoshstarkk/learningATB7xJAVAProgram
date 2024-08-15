package Ex_07202724;

public class empsal {
    String name;
    int employeeId;
    double Salary;


    void displayDetails() {
        System.out.println("employee name is :" + name);
        System.out.println("employee id :" + employeeId);
        System.out.println("employee sal:" + Salary);
    }

        void givenRaise(double amount){
          Salary +=amount;
            System.out.println("sal increased by :"+amount);
        }


    }


