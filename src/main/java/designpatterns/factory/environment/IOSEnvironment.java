package designpatterns.factory.environment;

import designpatterns.factory.button.Button;
import designpatterns.factory.button.IOSButton;

public class IOSEnvironment implements Environment {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
