package CommandPatternMembers.Commands;

import CommandPattern.Command;

public class MacroCommandOff implements Command {
    
    Command offCommand[];

    public MacroCommandOff(Command[] offCommand) {
        this.offCommand = offCommand;
    }
    
    @Override
    public void execute() {
        for(int i=0;i<offCommand.length;i++){
            offCommand[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=0;i<offCommand.length;i++){
            offCommand[i].undo();
        }
    }
    public String toString(){
        return "Macro Command Off Button";
    }

}
