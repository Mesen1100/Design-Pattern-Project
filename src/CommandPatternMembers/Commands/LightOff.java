package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.Light;

public class LightOff implements Command{
    private Light light;

    public LightOff(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
    public String toString(){
        return "Light Off Button";
    }

}
