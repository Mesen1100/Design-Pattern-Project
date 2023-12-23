package CommandPatternMembers.Commands;

import CommandPattern.Command;
import CommandPatternMembers.Furnitures.TV;

public class TVOn implements Command {
    private TV tv;

    public TVOn (TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
    public String toString(){
        return "TV On Button";
    }
}
