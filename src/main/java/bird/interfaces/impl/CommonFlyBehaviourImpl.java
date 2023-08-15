package bird.interfaces.impl;

import bird.interfaces.CommonFlyBehaviour;

public class CommonFlyBehaviourImpl implements CommonFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Common Fly Behaviour");
    }
}
