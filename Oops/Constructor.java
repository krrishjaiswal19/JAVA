class Student {

    String name;
    int age;
    int rollNumber;
    String collage;

    // default constructor
    Student(){
    }

    // parameterized constructor
    Student(String n, int a, int rn, String c){
        name = n;
        age = a;
        rollNumber = rn;
        collage = c;
    }

    public static void main(String[] args){

        Student s1 = new Student("krrish", 19, 101, "IIT delhi");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.collage);
    }
}

// Copy Constructor

// When we pass object refernce as a paremerter is called copy constructor

class A 
{
    int a; String b;
    A()
    {
        a=10; b="krrish";
        System.out.println(a+" "+b);
    }
    A(A ref) // Copy constructor
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args)
    {
        A r=new A();
        A r2=new A(r);
    }
}

// Private constructor

// if we make  private constructor we cannot acces out of class

class A
{
    int a;
    double b;
    String c;
    
    private A()
    {
        a=10;
        b=30.56;
        c="krrish jaiswal";
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args)
    {
        A r=new A();
    }
}