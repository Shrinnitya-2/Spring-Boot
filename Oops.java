import java.util.*;
import bank.*;
class Pen{
    //properties of pen
    String color;
    String type; //ballpont, gel, fountain

    //fun ction that is done by pen is write
    public void write(){
        System.out.println("writing something");
    }
    // data+ members(functions)
    public void printColor(){
        System.out.println(this.color);
        // this keyword is used to refer to the current object. It is used to access the fields and methods of the current object, and to distinguish between local variables and instance variables when they have the same name.
    }
}

class Student{
    String name;
    int age;
//polymorphism-- the ability of an object to take on many forms. It allows objects of different classes to be treated as objects of a common superclass. Polymorphism is achieved through method overloading and method overriding. Method overloading is when multiple methods have the same name but different parameters, while method overriding is when a subclass provides a specific implementation of a method that is already defined in its superclass.
    //method overloading-- compiletime
    public void printInfo(String name){
        System.out.println(name);
    }
     public void printInfo(int age){
        System.out.println(age);
     }

     public void printInfo(String anme, int age){
        System.out.println( name + " " +age);
     }
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//    }
    //constructor is a special method that is called when an object of a class is created. It has the same name as the class and does not have a return type. The purpose of a constructor is to initialize the properties of an object when it is created. In the code above, we use the default constructor of the Student class to create an object s1, and then we set its name and age properties before calling the printInfo() method to display the information about the student.
    Student(){
        System.out.println("constructor is called...");
    }

    //parameterized construcotr
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}

//abstraction hides internal details and provides only necessary methods.
abstract class Animal{
    abstract void walk();
    // cannot create object as it is abstract and just used for dervied purpose.

    //can have non abstract methods
    public void eat(){
        System.out.println("eats food");
    }
    //constructor of abstract class at first base class constructor is called then derived class constructor is called.
    Animal(){
        System.out.println("Animal constructor called...");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

//interface
// by default public, static and final by default.
interface Animal1{
    int eye = 2; // by default public, static and final
    void walk();
    //cannot have constructores and non abstract methods in interface. all methods are abstract by default in interface
}
// multiple inheritance is poosible thru interfaces
interface Herbivore{
        void eat();
}
class Tiger implements Animal1, Herbivore {
    public void walk() {
        System.out.println("walks on 6 legs");
    }
    public void eat() {
        System.out.println("eats meat");
    }
}

class Developer{
    String name;
    static String company; // static variable is shared among all objects of the class. It belongs to the class rather than any specific object. It can be accessed using the class name without creating an instance of the class. For example, in the code above, we have a static variable company that is shared among all Developer objects. We can access it using Developer.company without creating an instance of Developer.

    //static is used only once. it can change the value of object at once instead of multiple times.
    public static void changeCompany(){
        company = "Microsoft";
    }
}
//inheritance

//class Shape{
//    String color;
//}

// OOPS--Object Oriented Programming System. It is a programming paradigm that uses objects and classes to organize code and data. OOP allows for the creation of reusable and modular code, making it easier to maintain and scale applications. The main principles of OOP are encapsulation, inheritance, polymorphism, and abstraction.
//classes and objects-- a class is a blueprint for creating objects, which are instances of a class. A class defines the properties and behaviors of an object, while an object is a specific instance of a class that has its own unique state and behavior. In OOP, we can create multiple objects from the same class, each with its own set of values for the properties defined in the class.
//objects are created from classes using the new keyword, and we can access the properties and behaviors of an object using dot notation. For example, if we have a class called "Car" with properties like "make", "model", and "year", we can create an object of the Car class and access its properties like this:
// object Ex: maruti car
//classes ex maruti car blueprint basic properties are defines which needs to be perfomred by object.

public class Oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        //new keyword is used to create an object of a class. It allocates memory for the object and returns a reference to that memory. The reference can be used to access the properties and methods of the object. For example, in the code above, we use the new keyword to create two objects of the Pen class, pen1 and pen2, and we can access their properties and methods using dot notation.
        //Student() is a constructor. A constructor is a special method that is called when an object of a class is created. It has the same name as the class and does not have a return type. The purpose of a constructor is to initialize the properties of an object when it is created. In the code above, we use the default constructor of the Student class to create an object s1, and then we set its name and age properties before calling the printInfo() method to display the information about the student.
        // no return type is given to constructor and it has the same name as class. can be called only once when object is created. it is used to initialize the properties of an object.
        // parameterized constructor
        //Student s1= new Student("ABC" , 25);

        //below is the obejct of non parameterized construcotor
        Student s1 = new Student();
        s1.name = "Shrinitya";
        s1.age = 26;

        Student s2 = new Student(s1); // copy constructo
        //s2.printInfo();
//automatica garbage collector so no need of destructor.
     s1.printInfo(s1.age);
     s1.printInfo(s1.name);
     s1.printInfo(s1.name, s1.age);

     Shape s = new Shape();
     s.area();
     // Single Inheritance
     Triangle t1 = new Triangle();
     t1.color = "red";
     t1.area(5,6);
     System.out.println("The color of the triangle is: " + t1.color);

        // Multilevel Inheritance
        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.area(2,4);
        et1.area(6);

        //hierarchical Inheritance
        Circle c = new Circle();
        c.area(5);

        //encapuslation
        //bank.Account a1 = new bank.Account();
        //a1.name = "John Doe";

        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Tiger tiger = new Tiger();
        tiger.walk();

        Developer.company ="Google";
        Developer d1 = new Developer();
        d1.name = "DFG";
        System.out.println("The company of the developer is: " + d1.company);



    }
}
