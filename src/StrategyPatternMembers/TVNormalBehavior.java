package StrategyPatternMembers;

import StrategyPattern.TVBehavior;

public class TVNormalBehavior implements TVBehavior{
    @Override
    public int down(int channel) {
        if(channel>0){
            channel--;
        }
        if(channel==0){
            channel=200;
        }
        return channel;
    }
    @Override
    public int up(int channel) {
        if(channel<=200){
            channel++;
        }
        if(channel>200){
            channel=0;
        }
        return channel;
    }
    public String toString(){
        return "Normal Mode";
    }
}
