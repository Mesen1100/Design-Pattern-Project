package StrategyPatternMembers;

import StrategyPattern.LightBehavior;

public class LightNormalBehavior implements LightBehavior {
 @Override
 public void on() {
     System.out.println("Light On");
 }
 public String toString(){
    return "Normal Mode";
}
}
