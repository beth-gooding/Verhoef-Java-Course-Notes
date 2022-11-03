package Day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambdas {
    // We can define a lambda, and they are easy to write. Because they are easy to write, we don't need to have
    // multiple params for e.g. different string lengths, as we can just write another small lambda

    public static void main(String[] args){
        // Java comes with predefined interfaces to give types to our lambdas

        // Here we don't need curly braces and return keyword, but you would if you are doing more than one thing
        // Predicate takes in input type and expects boolean output
        Predicate<String> stringLambda = s -> s.length() > 4;

        // We can also define lambdas directly where we use them
        List<String> stringList = Arrays.asList("Hello", "my", "friends");
        List<String> filteredStringList = stringList.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
        System.out.println("The length of the filteredStringList should be 2. It is: " + filteredStringList.size());

        // You can tell the compiler the type it is taking into the lambda like this
        Predicate<String> stringLambda2 = (String s) -> s.length() > 4;


    }
}
