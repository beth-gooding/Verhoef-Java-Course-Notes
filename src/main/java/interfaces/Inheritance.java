package interfaces;

interface A {
    void a();
}

interface B {
    void b();
}

interface Choices {
    /*
     if you want to, you can add fields to interfaces (more of a legacy behaviour than a modern behaviour)
     these fields will become static properties on an implementing class. However, modern Java can use enums to do
     most of the same jobs now
     */
    int YES = 1;
    int NO = 0;

}

public interface Inheritance extends B, A {

}
