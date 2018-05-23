package com.example.harryschmach.tourguidendab;


import java.util.ArrayList;
import java.util.List;

public class FoodieContent {
    public static final List<SDAttraction> ITEMS = new ArrayList<>();
    //	4. Foodie Fun
    //		a. NP
    //		b. Barrio Logan
    //		c. Hillcrest
    //		d. OB
    static {
        // North Park
        ITEMS.add(
                new SDAttraction(R.string.np_name, R.string.np_desc,
                        R.string.np_gps, R.drawable.northpark)
        );
        // Barrio Logan
        ITEMS.add(
                new SDAttraction(R.string.barrio_name, R.string.barriofood_desc,
                        R.string.barrio_gps, R.drawable.barriofood)
        );
        // Hillcrest
        ITEMS.add(
                new SDAttraction(R.string.hillcrest_name, R.string.hillcrest_desc,
                        R.string.hillcrest_gps, R.drawable.hillcrest)
        );
        // Ocean Beach
        ITEMS.add(
                new SDAttraction(R.string.ob_name, R.string.ob_fooddesc,
                        R.string.ob_gps, R.drawable.obmarket)
        );
    }
}
