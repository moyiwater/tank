package com.nc.designpattern.builder;

public interface TerrainBuilder {
    TerrainBuilder buildWall ();
    TerrainBuilder buildFort ();
    TerrainBuilder buildMine ();
    Terrain build ();
}
