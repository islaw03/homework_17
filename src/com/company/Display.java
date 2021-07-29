package com.company;

public class Display {
    private int diogonal;
    private String producer;
    private String tip_matricy;

    public Display() {
    }


    public Display(int diogonal, String producer, String tip_matricy) {
        this.diogonal = diogonal;
        this.producer = producer;
        this.tip_matricy = tip_matricy;
    }

    public int getDiogonal() {
        return diogonal;

    }

    public void setDiogonal(int diogonal) {
        this.diogonal = diogonal;

    }

    public String getProducer() {
        return producer;


    }
    public void setProducer(String producer){
        this.producer = producer;


    }
    public String getTip_matricy(){
        return tip_matricy;

    }
    public void setTip_matricy(String tip_matricy){
        this.tip_matricy = tip_matricy;
    }

}