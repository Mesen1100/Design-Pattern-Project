package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.AirConditioner;

public class AirConditionerOn implements Command {
    private final AirConditioner airConditioner;

    public AirConditionerOn(AirConditioner Conditioner) {
        this.airConditioner = Conditioner;
    }

    @Override
    public void execute() {
        airConditioner.on();
    }

    @Override
    public void undo() {
        airConditioner.off();
    }

}
