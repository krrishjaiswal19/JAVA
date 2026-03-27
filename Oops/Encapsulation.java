// Encasulation is a mechanism through which we can wrapping the data members and membere method of class in a single unit

// Note
// Declare class variables as a private
// Declare class methods as a public

class A
{
    private int value; // Data hiding
    public void setValue(int x) // data abstraction
    {
        value =x;
    }
    public int getValue()
    {
        return++ value;
    }
}
class B
{
    public static void main(String[]args)
    {
        A r=new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}

// NOTE: datahiding & Abstraction's combination is called Encasulation.