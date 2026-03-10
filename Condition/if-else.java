import java.util.Scanner;

public class conditionifelse {

    public static void main(String[] args) {

        int pwd;
        System.out.print("Enter password: ");
        
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if (pwd == 1234) {
            System.out.println("krrish");
        } else {
            System.out.println("wrong password");
        }
    }
}