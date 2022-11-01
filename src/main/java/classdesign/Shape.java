package classdesign;

// final classes can inherit but cannot be inherited
final class Foo extends Animal{
    final int a = 5;
}

public abstract class Shape {
    int x;
    int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public abstract double getArea();
}

abstract class Triangle extends Shape {
    int a;
    int b;

    @Override
    public double getArea() {
        return 0.5*a*b;
    }
}

abstract class Square extends Shape {
    int l;

    @Override
    public double getArea() {
        return l*l;
    }
}