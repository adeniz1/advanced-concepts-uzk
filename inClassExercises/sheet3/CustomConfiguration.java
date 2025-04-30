package inClassExercises.sheet3;

import java.util.List;

public class CustomConfiguration extends Configuration {
    
    CustomConfiguration(String appName, List<String> modules) {
        super(appName, modules);
    }

    void changeAppName(String newName) {
        // this.appName = newName; // die final variable newName kann nicht verändert werden
        System.out.println("App name cannot be changed.");
    }
    void changeModules(List<String> newModules) {
        //this.modules = newModules; //  die Referenz des final Objektes ("List" ) kann nicht verändert werden
        System.out.println("Modules cannot be changed.");
    }

    void addModule(String module) {
        this.modules.add(module);
        // das geht, weil die Referenz des Objektes nicht verändert wird, sondern nur der Inhalt der Refrerenz/des Objektes
        System.out.println("Module cannot be added.");
    }

    //@Override
    /*void describe() {
        System.out.println("Custom Configuration Info:");
        System.out.println("App Name: " + appName + ", Modules: " + modules);
    }*/
    // ERROR: describe kann nicht überschrieben werden, da die Methode final ist
    // und nicht überschrieben werden kann. 
    // final bedeutet, dass die Methode nicht mehr verändert werden kann.

    
}
