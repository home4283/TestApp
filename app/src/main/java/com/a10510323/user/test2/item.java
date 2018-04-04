package com.a10510323.user.test2;

import java.io.Serializable;

public class item implements Serializable{

    private String place_title;
    public void setPlace_title(String place_title){
        this.place_title = place_title;
    }

    public String getPlace_title(){
        return this.place_title;
    }

    private String place_context;
    public void setPlace_context(String place_context){
        this.place_context = place_context;
    }

    public String getPlace_context() {
        return this.place_context;
    }

    private int place_img;
    public void setPlace_img(int place_img){
        this.place_img = place_img;
    }

    public int getPlace_img(){
        return this.place_img;
    }

    private String place_address;
    public void setplace_address(String place_address){
        this.place_address = place_address;
    }

    public String getplace_address(){
        return this.place_address;
    }

    private double double1;
    public void setDouble1(double double1){
        this.double1 = double1;
    }

    public double getDouble1(){
        return this.double1;
    }

    private double double2;
    public void setDouble2(double double2){
        this.double2 = double2;
    }

    public double getDouble2(){
        return this.double2;
    }

}
