package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ljm on 25/5/2017.
 */

public class Test2 {
//    void f1(){
//        throw new Exception("111"); //ERROR
//    }
    void f2() {
        throw  new RuntimeException("111");
    }
    void f3() throws Exception {
        throw new Exception("1111");
    }
    static void f4() {
        try{
            throw new RuntimeException("111");
        } catch (RuntimeException e) {
            System.out.println("ere");
        }
    }
    public static void main(String[] args) {
        f4();//OUTPUT:ere
    }
}