// when we want to call variable , method & constructor of superclass to sub class than we use super keyword

// Variable
class A
{
    int a =10;
}
class B extends A
{
    int a = 20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
class Test
{
    public static void main(String[] args) {
        B r=new B();
        r.show();
    }
}

//Method
class A
{
  void show()
  {
    System.out.println("Hello viewer");
  }
}
class B extends A
{
    void show()
    {
        super.show();
        System.out.println("Hello learner");
    }
}
class Test
{
    public static void main(String[] args)
    {
        B r=new B();
        r.show();
    }
}