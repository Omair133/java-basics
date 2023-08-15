package designpatterns.factory.environment;

import designpatterns.factory.button.Button;

public interface Environment {
    Button createButton();
}
