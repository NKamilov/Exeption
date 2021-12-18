package com.company;

import java.io.Closeable;

public class Car implements AutoCloseable {


    public Car() {
    }

//    public void close() {
//            System.out.println("Car is closing");
//    }

    public void drive (){
        System.out.println("Car on way");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close");
    }
}
