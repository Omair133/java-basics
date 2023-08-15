package designpatterns.factory.environment;

import designpatterns.factory.button.AndroidButton;
import designpatterns.factory.button.Button;

public class AndroidEnvironment implements Environment {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
