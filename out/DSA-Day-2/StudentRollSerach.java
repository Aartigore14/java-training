import java.util.Scanner;

class StudentRollSearch {
    public static void main(String[] args) {

        int[] rollNumbers = {101, 105, 110, 115, 120, 125};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == target) {
                System.out.println("Roll number found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Roll number not found.");
        }
    }
}