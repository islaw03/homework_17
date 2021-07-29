package com.company;

public class Hard_disk {
    private int memory;
    private int diskount;

    public Hard_disk() {
    }


    public Hard_disk(int memory, int diskount) {
        this.diskount = diskount;
        this.memory = memory;

    }

    public int getMemory() {
        return memory;

    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getDiskount(){
        return diskount;
    }
    public void setDiskount(int diskount){
        this.diskount = diskount;
    }
}

