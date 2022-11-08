package com.javapractice.designTypes.Builder_03;

public class MealA extends MealBuilder{

    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }

    public void buildFood() {
        meal.setFood("一盒薯条");
    }

}
