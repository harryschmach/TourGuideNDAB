package com.example.harryschmach.tourguidendab;


import java.util.ArrayList;
import java.util.List;

public class SunsetsContent {
    public static final List<SDAttraction> ITEMS = new ArrayList<>();

    static {
        // Calumet Park
        ITEMS.add(
                new SDAttraction(R.string.calumet_name, R.string.calumetsunset_desc,
                        R.string.calumet_gps, R.drawable.calumetpark)
        );
        // Sunset Cliffs
        ITEMS.add(
                new SDAttraction(R.string.sunsetcliff_name, R.string.sunsetcliff_desc,
                        R.string.sunsetcliff_gps, R.drawable.obcliffs)
        );
        // Cabrillo
        ITEMS.add(
                new SDAttraction(R.string.cabrillo_name, R.string.cabrillo_desc,
                        R.string.cabrillo_gps, R.drawable.cabrillo)
        );
        // Torrey Pines
        ITEMS.add(
                new SDAttraction(R.string.tp_name, R.string.tpsunset_desc,
                        R.string.tp_gps, R.drawable.torreypinespic)
        );
    }
}
