package com.company;

public class Laptop {
    private Display display;
    private String Brand ;
    private String color;
    private Hard_disk hard_disk;
    private Ozu ozu;
    private USB usb;
    private Keyboard keyboard;

    public Laptop(){

    }
    public Laptop(Display display, String brand, String color, Hard_disk hard_disk, Ozu ozu, USB usb,Keyboard keyboard){
        this.display= display;
        this.usb = usb ;
        this.Brand = brand;
        this.color = color;
        this.hard_disk = hard_disk;
        this.ozu = ozu;
        this.usb = usb ;
        this.keyboard = keyboard;

    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Hard_disk getHard_disk() {
        return hard_disk;
    }

    public void setHard_disk(Hard_disk hard_disk) {
        this.hard_disk = hard_disk;
    }

    public Ozu getOzu() {
        return ozu;
    }

    public void setOzu(Ozu ozu) {
        this.ozu = ozu;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
