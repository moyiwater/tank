package com.nc.test;

import sun.security.util.BitArray;

import java.util.BitSet;

public class Test02 {

    public static void main(String[] args) {
        BitSet bitSet = new BitSet(9);
        bitSet.set(22);
        bitSet.set(21);
        bitSet.set(23);
        bitSet.set(88);
        System.out.println(bitSet);
        bitSet.set(20, false);
        System.out.println(bitSet.size());
        System.out.println(bitSet.toString());
        System.out.println(bitSet.get(88));
        System.out.println(bitSet.get(10));
        System.out.println(bitSet.get(20));

        System.out.println(9>>6);

        System.out.println("**** ****" + getNum(15));
    }

    public static long getNum (int n) {
        long num = 2;
        for (int i = 1; i < n; i++) {
            num = num * 2;
        }
        return num;
    }

}
