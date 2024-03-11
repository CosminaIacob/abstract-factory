package design.patterns;

import design.patterns.app.Application;
import design.patterns.factories.GUIFactory;
import design.patterns.factories.MacOSFactory;
import design.patterns.factories.WindowsFactory;

public class Main {

    private static Application configureApplication() {

        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}