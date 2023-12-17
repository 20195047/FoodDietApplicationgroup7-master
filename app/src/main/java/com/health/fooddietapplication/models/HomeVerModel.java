package com.health.fooddietapplication.models;

public class HomeVerModel {

    int image;
    String name;
    String timer;
 String calories;

    public HomeVerModel(int image, String name, String timer, String calories){
        this.image = image;
        this.name = name;
        this.timer = timer;
        this.calories = calories;
 }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}
