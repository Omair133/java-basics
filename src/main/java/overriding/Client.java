package overriding;

public class Client {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
    }
}
