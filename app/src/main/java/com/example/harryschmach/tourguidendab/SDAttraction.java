package com.example.harryschmach.tourguidendab;

public class SDAttraction {
    /** name of the attraction location*/
    private int nameOfPlace;
    /** description of the attraction location*/
    private int descriptionOfPlace;
    /** location of the attraction location*/
    private int locationOfPlace;
    /** image of the attraction location*/
    private int resourceImID;

    public SDAttraction(int nameOfPlace, int descriptionOfPlace, int locationOfPlace, int resourceImID) {
        this.nameOfPlace = nameOfPlace;
        this.descriptionOfPlace = descriptionOfPlace;
        this.locationOfPlace = locationOfPlace;
        this.resourceImID = resourceImID;
    }

    /**
     * Get the string resource ID for the locale name.
     */
    public int getNameOfPlace() {
        return nameOfPlace;
    }

    /**
     * Get the string resource ID for the locale description.
     */
    public int getDescriptionOfPlace() {
        return descriptionOfPlace;
    }
    /**
     * Return the string resource ID of the locales location.
     */
    public int getLocationOfPlace() {
        return locationOfPlace;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getResourceImID() {
        return resourceImID;
    }

    @Override
    public String toString() {
        return String.valueOf(nameOfPlace);
    }
}
