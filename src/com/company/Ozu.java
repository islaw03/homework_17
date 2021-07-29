package com.company;

public class Ozu {
    private int volume;
    private String manufacturer;

    public Ozu() {

    }

    public Ozu(int volume, String manufacturer) {
        this.manufacturer = manufacturer;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;

    }

    public String getManufacturer() {
        return manufacturer;

    }

    public void setManufacturer(String manufacturer) {
   this.manufacturer = manufacturer;


    }

}

