package overriding;

public class B extends A{
    String companyName;
    B(){
        System.out.println("Inside B constructor");
    }
    void doSomething(String a){
        System.out.println("Doing something");
    }
}
