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
                new SDAttraction(R.string.calumet_name, R.string.calumetsunset_desc,
                        R.string.calumet_gps, R.drawable.calumetpark)
        );
        // Bird Rock
        ITEMS.add(
                new SDAttraction(R.string.sunsetcliff_name, R.string.sunsetcliff_desc,
                        R.string.sunsetcliff_gps, R.drawable.obcliffs)
        );
        // Scripps
        ITEMS.add(
                new SDAttraction(R.string.cabrillo_name, R.string.cabrillo_desc,
                        R.string.calumet_gps, R.drawable.cabrillo)
        );
        // Cardiff
        ITEMS.add(
                new SDAttraction(R.string.tp_name, R.string.tpsunset_desc,
                        R.string.tp_gps, R.drawable.torreypinespic)
        );
    }
}
