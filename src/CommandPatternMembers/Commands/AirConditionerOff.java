package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.AirConditioner;

public class AirConditionerOff implements Command {
    private final AirConditioner airConditioner; 
    
    public AirConditionerOff(AirConditioner Conditioner) {
        this.airConditioner = Conditioner;
    }

    @Override
    public void execute() {
       airConditioner.off();
    }

    @Override
    public void undo() {
        airConditioner.on();
    }
    public String toString(){
        return "Air Condioner Off Button";
    }

}
