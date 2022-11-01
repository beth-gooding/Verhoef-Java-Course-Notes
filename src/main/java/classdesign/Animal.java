package classdesign;

// access specifiers for toplevel classes/types
// - public: the class is available throughout the application
// - package (default, no keyword for this)
// - NOT private: cannot make toplevel classes private

// access specifiers for nested classes/types
// - public: the class is available throughout the application
// - package (default, no keyword for this)
// - protected
// - private

// access specifiers for local class/types
// - local (no keyword for this either)

// Only one class in the toplevel can be public

public class Animal {

    // Put this in the blueprint itself, once the object is added to memory the static blocks are added
    // You can change this value later as long as it isn't a constant
    static String species; // can put values here, but nothing more complicated like a function
    // static initialisation block
    // Put everything in here that you need to do calculate the static value
    static {
        species = "Lion";
    }
    // order of initialisation blocks matter, Java will run the first one first and so on

    // default per instance
    private int age;
    protected String name;

    // default constructor (takes no args), compiler writes one by default for you
    // Has the same name as the class and starts with a capital letter
    // You either write all the constructors or none of them
    public Animal () {
//        this.age = 0; // referring to this as an object
        // allows you to de-duplicate the construction process
        this(0); // referring to this as a constructor function call, so find the constructor that takes in age
        System.out.println("default constructor done");
    }
    // You can overload the constructors if you want to
    public Animal(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void sayHello() {
        System.out.println("Hello from animal, " + name);
    }


    // main method acts like the entrypoint to the programme/class
   // Static means it can run without an object being created
//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Mammal mammal = new Mammal();
//    }
}

// use the extends keyword to base one class on another class
class Mammal extends Animal {

    Mammal(){
        // must call the parent constructor implicitly or explicitly
//        super(); // implicitly - go find the default one
        super(7); // explicitly - go find the constructor that takes an input, lets you choose the one you need
    }

    public boolean isWarmBlooded;

    public void setWarmBlooded(boolean warmBlooded) {
        isWarmBlooded = warmBlooded;
    }

    public boolean getWarmBlooded () {
        return isWarmBlooded;
    }
}

class Lion extends Mammal {
    // Overriding a method from a class higher in the inheritance chain
    // Cannot change the method's signature, as Java will think it is a new function and not an override
    // You cannot change the access identifier to reduce the access to a method, but you can increase the access
    // e.g. public cannot be made private, but private can be made public

    // Brings in declarative programming to Java, was added in v5
    @Override // label, this tells the compiler that you have meant to override the method and checks the signature
    public void sayHello() {
        System.out.println("Hello from lion, " + name + "!");
    }
    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
        setWarmBlooded(true);
    }

    public void roar() {
        System.out.println(name + ", age " + getAge() + ", says: Roar!");
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Lion lion1 = new Lion();


        lion1.setProperties(3, "Simba");
        lion1.roar();

        lion1.sayHello();
        animal1.sayHello();

        // Will use the method from Lion class because the object is a lion, just the reference is an animal
        Animal animal2 = new Lion();
        animal2.sayHello();
        // animal2.roar(); // this line won't work because the reference is animal, and animals don't have roar method

        // The following line turns of the type-checker, so you may get an unexpected runtime failure
        Lion lion3 = (Lion) animal2; // Cast an object to reinterpret it as some other type
        lion3.setProperties(4, "Claws");
        lion3.roar();
    }
}

class Money {
    // Make a class immutable means you can use it as a value type
    private final double amount; // make the property final
    public double getAmount() {
        return amount; // make sure there is no setter
    }
    Money(double amount){
        this.amount = amount; // set value in the constructor
    }
}