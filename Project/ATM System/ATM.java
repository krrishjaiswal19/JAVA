import java.util.Scanner;
import java.util.InputMismatchException;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        while (true) {
            try {
                System.out.println("\n===== ATM =====");
                System.out.println("1. Withdraw");
                System.out.println("2. Check Balance");
                System.out.println("3. Exit");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount: ");
                        int amount = sc.nextInt();

                        if (amount > balance) {
                            throw new ArithmeticException("Insufficient balance!");
                        }

                        balance -= amount;
                        System.out.println("✅ Withdraw successful");
                        break;

                    case 2:
                        System.out.println("💰 Balance: " + balance);
                        break;

                    case 3:
                        System.out.println("👋 Exit");
                        return;

                    default:
                        System.out.println("❌ Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Enter valid number!");
                sc.next(); // clear wrong input

            } catch (ArithmeticException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }
}