import java.util.Scanner;

pucblic class doWhileLoop{
    public static void main(Static[]args){
        
        int num;
        System.out.print("Enter your number: ");
        Scanner s=new Scanner (System.in);
        num = s.nextInt();

        do{System.out.print(num+" ");
            ++num;
        }
        while(num<=10); 
    }
}