package org.example.FactoryPatternDesign;

public class IOS implements Os {

    @Override
    public void spec() {
        System.out.println("Is a closed source");
    }
}
