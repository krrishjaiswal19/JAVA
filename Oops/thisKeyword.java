class Student {

    String name;
    int age;
    int rollNumber;
    String collage;

    // default constructor
    Student(){
    }

    Student(String name){
        this(name, age:0, rollnumber:0, collage:null);
    }
    Student(String name, int age){
        this(name, age, rollNumber:0, collage:null);
    }
    Student(String name, int age, int rollNumber){
        this(name, age, rollNumber, collage:null);
    }
    Student(String name, int age, int rollnumber, String collage){
        this(name, age, rollNumber, collage)
    }
}