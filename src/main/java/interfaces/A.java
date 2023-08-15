package interfaces;

public class A implements B {
    int uniqueId;
    @Override
    public void doSomething() {
        System.out.println("I am doing something");
    }

    public void doNothing() {
        System.out.println("I am doing nothing");
    }
}
