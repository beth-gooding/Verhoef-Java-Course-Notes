package Day4;

public class Maximum {

    // Here we need to define different methods for calculating the maximum of two integers and maximum of two doubles
    int maxInt(int a, int b){
        return a < b ? b: a;
    }

    double maxDouble(double a, double b){
        return a <b ? b : a;
    }

    // We can write a generic instead which is missing the type information but can be used on multiple types
//    <T> T max(T a, T b) {
//        return a < b ? b : a;
//    }

}
