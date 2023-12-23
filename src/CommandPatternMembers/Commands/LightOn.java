package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.Light;

public class LightOn implements Command{
    private Light light;

    public LightOn(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    public String toString(){
        return "Light On Button";
    }
}
