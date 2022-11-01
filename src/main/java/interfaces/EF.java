package interfaces;

interface E {
    default void a(){
        System.out.println("From E");
    };
}

interface F {
    default void a(){
        System.out.println("From F");
    };
}
