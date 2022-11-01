package interfaces;

// both E and F have a default method a(), so we need to define our own working version of the method
public class AEF implements E, F{
    // This doesn't happen very often, but you can use super to grab the method from one of the interfaces
    @Override
    public void a() {
        F.super.a();
    }
}
