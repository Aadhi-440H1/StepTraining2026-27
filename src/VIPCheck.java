import java.util.Scanner;

public class VIPCheck {
    public static String validateCustomerId(String customerId) {
        return customerId.startsWith("VIP-") ? "VIP Customer" : "Regular Customer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        String input = sc.nextLine();

        System.out.println(validateCustomerId(input));
    }
}
