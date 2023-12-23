package StrategyPatternMembers;

import StrategyPattern.LightBehavior;

public class LightBlinkBehavior implements LightBehavior{
    double time=5;
    public LightBlinkBehavior(){

    }

    public LightBlinkBehavior(double t){
        this.time=t;
    }
    @Override
    public void on() {
        System.out.println("Light flash every "+time+" second");
    }

    public void setTime(double time) {
        this.time = time;
    }
}
