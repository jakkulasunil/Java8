package com.prg.java8;

interface Drawing {
    public void draw();
}

public class Program_8 {

    public static void main(String[] args) {
        //here we are using anonymous class to implement the single abstract method which is available
        // in the Drawing interface class.
        Drawing d = new Drawing() {
            @Override
            public void draw() {
                System.out.println("This is the method from Drawing Class");
            }
        };
        d.draw();

        //Lambda expression on FunctionalInterface.
        Drawing d1=()-> System.out.println("Using Lambda  Expression.");
        d1.draw();


    }
}
