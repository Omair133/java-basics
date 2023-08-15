package bird;

import bird.interfaces.impl.CommonFlyBehaviourImpl;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Pigeon(new CommonFlyBehaviourImpl());
        Bird b2 = new Penguin();
        Bird b3 = new Sparrow(new CommonFlyBehaviourImpl());
    }
}
