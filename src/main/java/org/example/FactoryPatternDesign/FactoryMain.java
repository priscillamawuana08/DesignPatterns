package org.example.FactoryPatternDesign;

public class FactoryMain {
    public static void main(String[] args) {

//        normal way to instantiate
      /**  Os obj = new Andriod();
        obj.spec();
       **/
//      Factory design pattern
        OsFactory osf = new OsFactory();
        Os obj = osf.getInstance("");
        obj.spec();
    }
}
