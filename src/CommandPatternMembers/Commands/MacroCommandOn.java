package CommandPatternMembers.Commands;

import CommandPattern.Command;

public class MacroCommandOn implements Command {
    
    Command onCommand[];

    public MacroCommandOn(Command[] onCommand) {
        this.onCommand = onCommand;
    }
    
    @Override
    public void execute() {
        for(int i=0;i<onCommand.length;i++){
            onCommand[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i=0;i<onCommand.length;i++){
            onCommand[i].undo();
        }
    }
    public String toString(){
        return "Macro Command On Button";
    }
}
