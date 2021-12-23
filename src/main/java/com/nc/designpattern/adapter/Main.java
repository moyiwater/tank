package com.nc.designpattern.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 适配器模式
 */
public class Main {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("G:\\test\\test.txt");
        InputStreamReader isr = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(isr);
//        String s = bufferedReader.readLine();
//        while (s != null && !s.equals("")) {
//            System.out.println(s);
//        }
        while (true) {
            String s = bufferedReader.readLine();
            if (s != null && !s.equals("")) {
                System.out.println(s);
            } else {
                break;
            }
        }
        bufferedReader.close();
    }
}
