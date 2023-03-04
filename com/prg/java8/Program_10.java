package com.prg.java8;

interface SaySomething{
        public String message();
}

public class Program_10 {
    public String message(){
        return "Lambda Expression";
    }

    public static void main(String[] args) {
        SaySomething say=new Program_10()::message;
        System.out.println(say.message());
    }
}
