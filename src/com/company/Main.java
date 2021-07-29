package com.company;

public class Main {

    public static void main(String[] args) {
        Hard_disk hard_disk = new Hard_disk(1, 10);
        Display display = new Display(18, "Asus", "LCD");
        USB usb = new USB(1, 2212);
        Ozu ozu = new Ozu(8,"X3");
        Keyboard keyboard = new Keyboard(false,true);

        Laptop laptop = new Laptop();
        laptop.setBrand("Asus");
        laptop.setColor("bLACK");
        laptop.setDisplay(display);
        laptop.setHard_disk(hard_disk);
        laptop.setOzu(ozu);
        laptop.setUsb(usb);
        laptop.setKeyboard(keyboard);






        System.out.println("Brand "+ laptop.getBrand());
        System.out.println("Color " +laptop.getColor() );
        System.out.println("Display " + laptop.getDisplay());
        System.out.println("HD " + laptop.getHard_disk());
        System.out.println("OZU " + laptop.getOzu());
        System.out.println("USB " + laptop.getUsb());
        System.out.println("Keyboard " + laptop.getKeyboard());






























    }
}
