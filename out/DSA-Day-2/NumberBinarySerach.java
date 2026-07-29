import java.util.Scanner;
public class NumberBinarySerach {
        public static void main(String[] args) {

            int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            int target = sc.nextInt();

            int low = 0;
            int high = numbers.length - 1;

            boolean found = false;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (numbers[mid] == target) {
                    System.out.println(target + " found at index " + mid);
                    found = true;
                    break;
                }
                else if (numbers[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            if (!found) {
                System.out.println(target + " not found.");
            }
        }
    }

