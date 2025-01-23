package org.example.FactoryPatternDesign;

public class OsFactory {
    public Os getInstance(String osName) {
        if (osName.equals("Open")) {
            return new Andriod();
        }
        else if (osName.equals("Close")) {
            return  new IOS();
        }
        else  return new Windows();

    }
}
