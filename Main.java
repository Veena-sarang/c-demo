import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();

        User user = new User(userId, userName, dateOfBirth);
        System.out.println("\nCaptured User Data:");
        System.out.println(user);
    }
}
