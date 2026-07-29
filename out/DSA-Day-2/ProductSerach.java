import java.util.Scanner;
public class ProductSerach {
        public static void main(String[] args) {

            int[] productIds = {501, 502, 503, 504, 505, 506, 507};

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Product ID: ");
            int target = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < productIds.length; i++) {
                if (productIds[i] == target) {
                    System.out.println("Product found at position " + (i + 1));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Product not found.");
            }

            sc.close();
        }
    }
