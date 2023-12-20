package CommandPatternMembers.Furnitures;

import java.util.Stack;

import CommandPattern.Command;
import CommandPatternMembers.Commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands=new Command[8];
        offCommands=new Command[8];
        Command noCommand=new NoCommand();
        for(int i=0;i<8;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }

    private static final Stack<Command> undoStack = new Stack<>();
    private static final Stack<Command> redoStack = new Stack<>();

    public void setCommand(int slot,Command onCommand,Command offCommand){
        this.onCommands[slot]=onCommand;
        this.offCommands[slot]=offCommand;
    }

    public static void submit(Command command) {
        command.execute();
        undoStack.add(command);
        redoStack.clear();
    }

    public static void undo() {
        if (!undoStack.isEmpty()) {
            undoStack.peek().execute();
            redoStack.add(undoStack.pop());
        }
    }

    public static void redo() {
        if (!redoStack.isEmpty()) {
            redoStack.peek().execute();
            undoStack.add(redoStack.pop());
        }
    }

    public String toString(){
        StringBuffer stringBuff=new StringBuffer();
        stringBuff.append("\n -----Remote Control----- \n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot" + i + "] "+ onCommands[i].getClass().getName()+ " " +offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    } 
}
