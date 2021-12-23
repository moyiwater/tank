package com.nc.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder builder = new ComplexTerrainBuilder();
        Terrain build = builder.buildWall().buildMine().buildFort().build();
        System.out.println(build);

        Person p = new Person.PersonBuilder()
                .basicInfo(1, "张三", 18)
                .score(20)
                .weight(200)
                .loc("bj", "23")
                .build();
        System.out.println(p);
    }
}
