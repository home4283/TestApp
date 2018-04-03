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

}
