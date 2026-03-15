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