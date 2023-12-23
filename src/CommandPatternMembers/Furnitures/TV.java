package CommandPatternMembers.Furnitures;

import StrategyPattern.TVBehavior;
import StrategyPatternMembers.TVNormalBehavior;

public class TV {
    private boolean active;
    private int channel;
    private TVBehavior behavior;

    public TV() {
        behavior = new TVNormalBehavior();
    }

    public TV(TVBehavior tvBehavior) {
        this.behavior = tvBehavior;
    }

    public void on() {
        active = true;
        System.out.println("TV is Open");
        printChannel();
    }

    public void off() {
        active = false;
        System.out.println("Tv is Closed");
    }

    public void up() {
        if (active) {
            channel=behavior.up(channel);
            printChannel();
        } else {
            System.out.println("TV is not open");
        }

    }

    public void down() {
        if (active) {
            channel=behavior.down(channel);
            printChannel();
        } else {
            System.out.println("TV is not open");
        }

    }

    public void printChannel() {
        System.out.println("Channel is " + channel);
    }

    public void setBehavior(TVBehavior behavior) {
        this.behavior = behavior;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
