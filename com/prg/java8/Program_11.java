package com.prg.java8;

import java.util.StringJoiner;

public class Program_11 {

    public static void main(String[] args) {
        StringJoiner joiner=new StringJoiner(",");
        joiner.add("Hello");
        joiner.add("Welcome");
        joiner.add("To");
        joiner.add("StringJoiner");
        System.out.println(joiner);


    }
}
