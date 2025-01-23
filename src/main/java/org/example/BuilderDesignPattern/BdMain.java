package org.example.BuilderDesignPattern;

public class BdMain {
    public static void main(String[] args) {

//        normal way
      /**  Phone type = new Phone("IOs","2.5hz",32,3.5,90);
        System.out.println(type); **/


//      builder design pattern
      Phone type = new PhoneBuilder().setOs("Android").setProcessor("2.5hz").getPhone();
        System.out.println(type);
    }
}
