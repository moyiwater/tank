package com.nc.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Terrain {
    Wall w;
    Fort f;
    Mine m;
}

@ToString
@AllArgsConstructor
class Wall {
    int x, y, w, h;
}

@ToString
@AllArgsConstructor
class Fort {
    int x, y, w, h;
}

@ToString
@AllArgsConstructor
class Mine {
    int x, y, w, h;
}
