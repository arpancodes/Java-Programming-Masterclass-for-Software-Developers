package com.company;

public class Main {

    public static void main(String[] args) {
	    byte myByteValue = 127;
	    short myShortValue = 12233;
	    int myIntValue = 9900990;
	    long longValue = 50000 + (10 * (myByteValue + myShortValue + myIntValue));
        System.out.println(longValue);
    }
}
