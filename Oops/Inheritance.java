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

// Multilevel Inheritance
// One super class and multiple sub classes is called multiple inheritance

class A
{
    int a,b,c;
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println("sum of two numbers:"+c);
    }
    void sub()
    {
        a=200;
        b=100;
        c=a-b;
        System.out.println("Sub of two numbers:"+c);
    }
}
class B extends A
{
    void multi()
    {
        a=10;
        b=20;
        c=a*b;
        System.out.println("Multiply of two numbers:"+c);
    }
    void div()
    {
        a=10;
        b=2;
        c=a/b;
        System.out.println("Divison of two numbers:"+c);
    }    
}
class C extends B
{
    void rem()
    {
        a=10;
        b=13;
        c=a%b;
        System.out.println("Reminder of two no:"+c);
    }
}
class Test
{
    public static void main(String[] args) {
        c r=new c();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}

// Hierarchial Inheritance
// if multiple sub classes extends one super class is called hierarchical inheritance

class A
{
    void input()
    {
        System.out.println("Enter your number: ");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("My name is krrish");
    }
}

class C extends A
{
    void Display()
    {
        System.out.println("My surname is jaiswal");
    }
}

class Demo
{
    public static void main(String[] args)
    {
        B r = new B();
        C r2 = new C();

        r.input();
        r.show();

        r2.input();
        r2.Display();
    }
}

