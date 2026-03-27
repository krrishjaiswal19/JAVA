// Abstraction is a process of hiding the implemenation details from the user, only the highlighted set  of service provided to the user.
// Advantage: 1) Security 2) Enhancement

// Abstarct class
// class which contain abstarct keywords in its declartion is called abstract class

abstract class animal{
    animal()
    {
        System.out.println("All animals....!");
    }
    public abstract void sound();
}
class Dog extends animal
{
    Dog()
    {
        super();
    }
    public void sound()
    {
        System.out.println("Dog id barking..");
    }
}
class Lion extends animal{
    public void sound()
    {
        System.out.println("Lion is Roar");
    }
}

// Abstarct Method
abstract class Programming {
    
    public abstract void Developer();
    public abstract void Rank();
}

class HTML extends Programming {

    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }

    @Override
    public void Rank() {
        System.out.println("Rank: 1");
    }
}

abstract class Java extends Programming {

    @Override
    public void Developer() {
        System.out.println("Rank: 3");
    }
}

class Main {
    public static void main(String[] args) {

        Programming h = new HTML();
        h.Developer();
        h.Rank();
    }
}