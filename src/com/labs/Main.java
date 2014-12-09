package com.labs;

public class Main {

    public static void main(String[] args) {

        AnotherCustomGenericList<? super String> genericList = new AnotherCustomGenericList<String>(10);

        genericList.add("Hello");
        genericList.add("World");

        System.out.println(genericList.get(1));
        System.out.println(genericList.get(2));

    }
}
