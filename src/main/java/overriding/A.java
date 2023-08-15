package overriding;

public class A {
    int id;
    A(){
        System.out.println("Inside constructor of A");
    }
    void doSomething(String a){
        System.out.println("Doing something");
    }
}
