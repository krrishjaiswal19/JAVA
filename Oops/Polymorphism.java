// Same object having differnt behavoiur

// two types of polymosrphism
// compiletime

class A{
    int Add()
    {
        int a=10; b=20,c;
        c=a+b;
        return c;
    }
    void add(int x, int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x, double y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        A r=new A();
        r.add(100, 200);
        r.add(50, 45.32);

        int add = r.add();
        System.out.println(add);
    }
}

// Runtime 

class shape
{
    void draw()
    {
        System.out.println("Can't say shape type");
    }
}
class square extends shape
{
    @Override
    void draw()
    {
        System.out.println("square shape");
    }
}
class Demo
{
    public static void main(String[] args) {
        shape r = new square();
        r.draw();
    }
}
