package interfaces;

public class client {
    public static void main(String[] args) {
        B b = new A();
        b.doSomething();

        A a = new A();
        System.out.println(a.uniqueId);
        a.doNothing();
        a.doSomething();
    }
}
