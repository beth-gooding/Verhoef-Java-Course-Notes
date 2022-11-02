package Day3;

// Use the annotation functionalInterface so that Java can tell you if you're using it correctly
@FunctionalInterface
public interface AFunctionalInterface {
    boolean test(String string);
    /*
        if we try to write a second abstract function, Java will give us an error because we can only have one abstract
        method in a given FunctionalInterface
    */
    // boolean test2(String string);
}
