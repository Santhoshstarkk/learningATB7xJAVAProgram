package labassigments;

public class Secondhighsal {
    public static void main(String[] args) {

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max;
        int secondMax;

        // Initialize max and secondMax with the first two elements appropriately
        if (salaries[0] > salaries[1]) {
            max = salaries[0];
            secondMax = salaries[1];
        } else {
            max = salaries[1];
            secondMax = salaries[0];
        }

        // Iterate through the rest of the array
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                secondMax = max;
                max = salaries[i];
            } else if (salaries[i] > secondMax && salaries[i] != max) {
                secondMax = salaries[i];
            }
        }

        System.out.println("The second highest salary is: " + secondMax);
    }
}

