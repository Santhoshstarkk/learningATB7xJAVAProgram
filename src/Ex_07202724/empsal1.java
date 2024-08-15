package Ex_07202724;

public class empsal1 {
    public static void main(String[] args) {
        empsal employee =new empsal();

        employee.name="sandy";
        employee.employeeId=2155;
        employee.Salary=50000;

        employee.displayDetails();
        employee.givenRaise(50000);

    }
}
