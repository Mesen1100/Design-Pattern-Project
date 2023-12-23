package CommandPatternMembers.Furnitures;

import StrategyPattern.LightBehavior;
import StrategyPatternMembers.LightNormalBehavior;

public class Light {

    private boolean active;
    private LightBehavior lightBehavior;

    public Light(){
        this.lightBehavior=new LightNormalBehavior();
    }

    public void on(){
        active=true;
        lightBehavior.on();
    }
    public void off(){
        active=false;
        System.out.println("Light Off");
    }

    public void setLightBehavior(LightBehavior lightBehavior) {
        this.lightBehavior = lightBehavior;
    }
}
