package com.javapractice.designTypes.Builder_03;

public class MealB extends MealBuilder{

    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }

    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

}
