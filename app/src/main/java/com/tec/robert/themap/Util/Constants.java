package com.tec.robert.themap.Util;

import java.util.Random;

public class Constants {
    public static final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/1.0_hour.geojson";
    public static final int LIMIT = 25;

    public static int randomInt(int max, int min){
        return new Random().nextInt(max - min) + min;
    }
}
