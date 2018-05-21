package com.example.harryschmach.tourguidendab;


import java.util.ArrayList;
import java.util.List;

public class AttractionsContent {
    public static final List<SDAttraction> ITEMS = new ArrayList<>();

    static {
        // Hotel Del Coronado
        ITEMS.add(
                new SDAttraction(R.string.hotel_del_name, R.string.hotel_del_desc,
                        R.string.hotel_del_gps, R.drawable.hoteldel)
        );
        // Balboa Park
        ITEMS.add(
                new SDAttraction(R.string.balboa_name, R.string.balboa_desc,
                        R.string.balboa_gps, R.drawable.blackwhitebalboa)
        );
        // Bario Logan
        ITEMS.add(
                new SDAttraction(R.string.barrio_name, R.string.barrio_desc,
                        R.string.barrio_gps, R.drawable.corobridge)
        );
        // Torrey Pines
        ITEMS.add(
                new SDAttraction(R.string.tp_name, R.string.tpattr_desc,
                        R.string.tp_gps, R.drawable.torreypinespic)
        );
    }
}
