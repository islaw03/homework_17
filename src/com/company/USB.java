package com.company;

public class USB {
    private int port;
    private int id;

    public USB(){

    }
    public USB(int port,int id){
        this.id = id;
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;

    }
}
