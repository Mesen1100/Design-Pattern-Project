package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.TV;

public class TVOff implements Command {
    private TV tv;

    public TVOff(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
