package com.a10510323.user.test2;

import java.io.Serializable;

public class itemhotel implements Serializable {

    private String hotel_title;
    public void setHotel_title(String hotel_title){
        this.hotel_title = hotel_title;
    }

    public String getHotel_title(){
        return this.hotel_title;
    }

    private String hotel_context;
    public void setHotel_context(String hotel_context){
        this.hotel_context = hotel_context;
    }

    public String getHotel_context() {
        return this.hotel_context;
    }

    private int hotel_img;
    public void setHotel_img(int hotel_img){
        this.hotel_img = hotel_img;
    }

    public int getHotel_img(){
        return this.hotel_img;
    }

    private String hotel_address;
    public void setHotel_address(String hotel_address){
        this.hotel_address = hotel_address;
    }

    public String getHotel_address(){
        return this.hotel_address;
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
