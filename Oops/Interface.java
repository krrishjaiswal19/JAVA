import java.util.Scanner;
interface client{
    void input(); 
    void output();
}
class Krrish implements client{
    String name;
    double salary;
    public void input()
    {
        Scanner r=new scanner(System.in);
        System.out.println("Enter username: ");
        name = r.nextline();
        System.out.println("Enter salary: ");
        salary=r.nextDouble();
}
void output(){
    System.out.println(name+" "+salary);
}
public static void main(String[] args) {
    client c = new krrish();
    c.input();
    c.output();
}
