import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter any two numbers: ");
        Scanner s=new Scanner(System.in);
        
        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.print("Sum of two numbers: "+c);
    }
}