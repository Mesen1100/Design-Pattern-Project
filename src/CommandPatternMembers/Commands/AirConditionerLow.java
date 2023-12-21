package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.AirConditioner;

public class AirConditionerLow implements Command{

    private AirConditioner airConditioner;

    

    public AirConditionerLow(AirConditioner Conditioner) {
        this.airConditioner = Conditioner;
    }

    @Override
    public void execute() {
        airConditioner.low();
    }

    @Override
    public void undo() {
        airConditioner.high();
    }


}
