package org.example.FactoryPatternDesign;

public class Windows implements Os{
    @Override
    public void spec() {
        System.out.println("Windows OS");
    }
}
