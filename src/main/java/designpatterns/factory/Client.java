package designpatterns.factory;

import designpatterns.factory.button.Button;
import designpatterns.factory.environment.Environment;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        Environment environment = flutter.getEnvironment(SupportedEnvironment.ANDROID);
        environment.createButton();
    }
}
