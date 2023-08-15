package abs;

public class B extends A{
    @Override
    void printName() {
        System.out.println(super.name);
    }

    @Override
    void printAge() {
        System.out.println(super.age);
    }
}
