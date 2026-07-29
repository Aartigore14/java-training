import java.util.Scanner;
public class BookSearch {
        public static void main(String[] args) {

            int[] bookIds = {1001, 1005, 1010, 1015, 1020, 1025, 1030};

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Book ID: ");
            int target = sc.nextInt();

            int low = 0;
            int high = bookIds.length - 1;

            boolean found = false;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (bookIds[mid] == target) {
                    System.out.println("Book ID found at index " + mid);
                    found = true;
                    break;
                }
                else if (bookIds[mid] < target) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            if (!found) {
                System.out.println("Book ID not found.");
            }

            sc.close();
        }
    }
