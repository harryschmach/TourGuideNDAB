package com.example.harryschmach.tourguidendab;


import java.util.ArrayList;
import java.util.List;

public class SurfContent {
    public static final List<SDAttraction> ITEMS = new ArrayList<>();
    //	3. Surf Zones
    //		a. OB
    //		b. Bird Rock
    //		c. Scripps
    //      d. Cardiff
    static {
        // Ocean Beach
        ITEMS.add(
                new SDAttraction(R.string.ob_name, R.string.ob_desc,
                        R.string.ob_gps, R.drawable.obsurfpic)
        );
        // Bird Rock
        ITEMS.add(
                new SDAttraction(R.string.birdrock_name, R.string.calumetsurf_desc,
                        R.string.birdrock_gps, R.drawable.brsurf)
        );
        // Scripps
        ITEMS.add(
                new SDAttraction(R.string.scripps_name, R.string.scripps_desc,
                        R.string.scripps_gps, R.drawable.scrippssurf)
        );
        // Cardiff
        ITEMS.add(
                new SDAttraction(R.string.cardiff_name, R.string.cardiff_desc,
                        R.string.cardiff_gps, R.drawable.cardiff)
        );
    }
}
