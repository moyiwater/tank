package com.nc.test;

public class Test04 {

    public static void main(String[] args) {
        String str = null;
        try {
            str.toString();
        } catch (NullPointerException e) {

        } finally {
            System.out.println("执行完毕");
        }
    }

}
