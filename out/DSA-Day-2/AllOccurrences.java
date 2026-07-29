
    import java.util.Scanner;
    public class AllOccurrences {
        public static void main(String[] args) {

            int[] numbers = {2, 5, 8, 5, 10, 5, 15};

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            int target = sc.nextInt();

            boolean found = false;

            System.out.println("Number found at positions:");

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == target) {
                    System.out.println("Index " + i);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Number not found.");
            }

            sc.close();
        }
    }

