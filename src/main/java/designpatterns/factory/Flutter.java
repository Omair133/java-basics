package designpatterns.factory;

import designpatterns.factory.environment.AndroidEnvironment;
import designpatterns.factory.environment.Environment;
import designpatterns.factory.environment.IOSEnvironment;

public class Flutter {


    public void setTheme() {
        System.out.println("Setting theme");
    }
    public void setRefreshRate() {
        System.out.println("Setting Refresh Rate");
    }

    Environment getEnvironment(SupportedEnvironment supportedEnvironment) {
        if(supportedEnvironment.equals(SupportedEnvironment.ANDROID))
            return new AndroidEnvironment();
        else if(supportedEnvironment.equals(SupportedEnvironment.IOS))
            return new IOSEnvironment();
        return null;
    }
}
