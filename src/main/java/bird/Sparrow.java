package bird;

import bird.interfaces.CommonFlyBehaviour;
import bird.interfaces.Fly;

public class Sparrow extends Bird implements Fly {

    CommonFlyBehaviour commonFlyBehaviour;

    Sparrow(CommonFlyBehaviour commonFlyBehaviour) {
        this.commonFlyBehaviour = commonFlyBehaviour;
    }
    @Override
    public void fly() {

    }
}
