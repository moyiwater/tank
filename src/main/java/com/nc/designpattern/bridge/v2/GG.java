package com.nc.designpattern.bridge.v2;

import com.nc.designpattern.bridge.v1.Book;
import com.nc.designpattern.bridge.v1.Gift;
import com.nc.designpattern.bridge.v1.MM;

public class GG {
    public void chase (MM mm) {
        Gift g = new Book();
        give(mm, g);
    }

    public void give (MM mm, Gift g) {

    }
}
