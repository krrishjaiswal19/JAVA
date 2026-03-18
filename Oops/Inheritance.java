// Simple Inheritance
// Containing only one superclass and only sub class

class student
{
    int roll, marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name, marks");
    }
}
class krrish extends student{
    void display(){
        roll =1;
        name="krrish"
        marks = 99;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        krrish r = new krrish();
        r.input();
        r.display();
    }
}