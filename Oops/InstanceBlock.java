class A
{
    int a,b;
    static void show() // Static block
    {
        System.out.println("Krrish jaiswal");
    }
    A() // Constructor
    {
        a = 30;
        b = 40;
        System.out.println(a+" "+b);
    }
    { 
        a=10;  // Instance block
        b=20;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        A.show();
        A r=new A();
    }
}