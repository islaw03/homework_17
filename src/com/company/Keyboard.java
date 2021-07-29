package com.company;

public class Keyboard {
    private boolean backlight;
    private boolean dopNumbers;

    public Keyboard(){

    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isDopNumbers() {
        return dopNumbers;
    }

    public void setDopNumbers(boolean dopNumbers) {
        this.dopNumbers = dopNumbers;
    }

    public Keyboard(boolean backlight, boolean dopNumbers){
        this.backlight = backlight;
        this.dopNumbers = dopNumbers;

    }

}
