package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.AirConditioner;

public class AirConditionerHigh implements Command {
    private final AirConditioner airConditioner;

    

    public AirConditionerHigh(AirConditioner Conditioner) {
        this.airConditioner = Conditioner;
    }

    @Override
    public void execute() {
       airConditioner.high();
    }

}
