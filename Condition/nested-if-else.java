import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        int password;

        System.out.print("Enter username: ");
        username = sc.next();

        System.out.print("Enter password: ");
        password = sc.nextInt();

        if(username.equals("admin")){

            if(password == 1234){
                System.out.println("Login Successful");
            }else{
                System.out.println("Wrong Password");
            }

        }else{
            System.out.println("Wrong Username");
        }

        sc.close();
    }
}