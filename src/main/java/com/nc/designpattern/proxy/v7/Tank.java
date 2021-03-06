package com.nc.designpattern.proxy.v7;

import java.util.Random;

/**
 * 问题：我想记录坦克的移动事件
 * 最简单的方法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 * v5 用代理？
 * v6 代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator？
 * v7 代理的对象改为Movable类型-越来越像decorator了
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank Moving clacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank t = new Tank();
        TankTimeProxy ttp = new TankTimeProxy(t);
        TankLogProxy tlp = new TankLogProxy(ttp);
        tlp.move();
        //两种方式调用
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}

class TankTimeProxy implements Movable {

    Movable m;

    public TankTimeProxy (Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy (Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}

interface Movable {
    void move();
}

