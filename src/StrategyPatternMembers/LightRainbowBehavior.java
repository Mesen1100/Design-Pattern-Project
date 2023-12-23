package StrategyPatternMembers;

import java.util.ArrayList;

import StrategyPattern.LightBehavior;

public class LightRainbowBehavior implements LightBehavior {
    ArrayList<String> colors;

    public LightRainbowBehavior() {
        colors=new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Red");

    }

    public LightRainbowBehavior(ArrayList<String> newcolors) {
        this.colors = newcolors;
    }

    @Override
    public void on() {
        System.out.println("Light is in Rainbow Mode");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Light Color is " + colors.get(i));
        }

    }

    public void addColor(String color) {
        colors.add(color);
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

}
