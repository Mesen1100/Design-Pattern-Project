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
        for(int i=0;i<onCommands.length;i++){
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

    public void onButtonPress(int slot){
        onCommands[slot].execute();
        undoStack.add(onCommands[slot]);
        redoStack.clear();
    }
    public void offButtonPress(int slot){
        offCommands[slot].execute();
        undoStack.add(offCommands[slot]);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            undoStack.peek().undo();
            redoStack.add(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            redoStack.peek().execute();
            undoStack.add(redoStack.pop());
        }
    }

    public String toString(){
        StringBuffer stringBuff=new StringBuffer();
        stringBuff.append("\n -----Remote Control----- \n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot" + i + "] "+ onCommands[i].toString()+
             "-----" +offCommands[i].toString()+"\n");
        }
        return stringBuff.toString();
    } 
}
