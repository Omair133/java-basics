package bird;

import bird.interfaces.CommonFlyBehaviour;
import bird.interfaces.Fly;

public class Pigeon extends Bird implements Fly {

    CommonFlyBehaviour commonFlyBehaviour;

    Pigeon(CommonFlyBehaviour commonFlyBehaviour){
        this.commonFlyBehaviour = commonFlyBehaviour;
    }
    @Override
    public void fly() {
        commonFlyBehaviour.fly();
    }
}
