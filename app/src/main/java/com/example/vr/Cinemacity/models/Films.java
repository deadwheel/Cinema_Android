package com.example.vr.Cinemacity.models;

/**
 * Created by vr on 2017-06-05.
 */

public class Films {
    private String title;
    private String desc;
    private String img;
    private String date_show;
    private String year;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String production;
    private String director;

    public Films(String title, String desc, String img, String date_show, String year, String time, String production, String director) {
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.date_show = date_show;
        this.year = year;
        this.time = time;
        this.production = production;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate_show() {
        return date_show;
    }

    public void setDate_show(String date_show) {
        this.date_show = date_show;
    }
}

