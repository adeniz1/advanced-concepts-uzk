package inClassExercises.sheet3;

import java.util.List;

public class Configuration {
    final String appName ;
    final List<String> modules;

    public Configuration(String appName, List<String> modules) {
        this.appName = appName;
        this.modules = modules;
    }   

    final void describe() {
        System.out.println("Info:");
        System.out.println("App Name: " + appName + ", Modules: " + modules);
    }
    
}
