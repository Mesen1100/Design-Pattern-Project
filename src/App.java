import java.io.File;
import java.util.Date;
import java.util.Scanner;

import CommandPattern.Command;
import CommandPatternMembers.Commands.AirConditionerHigh;
import CommandPatternMembers.Commands.AirConditionerLow;
import CommandPatternMembers.Commands.AirConditionerOff;
import CommandPatternMembers.Commands.AirConditionerOn;
import CommandPatternMembers.Commands.LightOff;
import CommandPatternMembers.Commands.LightOn;
import CommandPatternMembers.Commands.MacroCommandOff;
import CommandPatternMembers.Commands.MacroCommandOn;
import CommandPatternMembers.Commands.MusicPlayerDown;
import CommandPatternMembers.Commands.MusicPlayerOff;
import CommandPatternMembers.Commands.MusicPlayerOn;
import CommandPatternMembers.Commands.MusicPlayerUp;
import CommandPatternMembers.Commands.TVDown;
import CommandPatternMembers.Commands.TVOff;
import CommandPatternMembers.Commands.TVOn;
import CommandPatternMembers.Commands.TVUp;
import CommandPatternMembers.Furnitures.AirConditioner;
import CommandPatternMembers.Furnitures.Light;
import CommandPatternMembers.Furnitures.MusicPlayer;
import CommandPatternMembers.Furnitures.RemoteControl;
import CommandPatternMembers.Furnitures.TV;
import ObserverPatternMembers.Furniture;
import ObserverPatternMembers.Person;
import StrategyPattern.LightBehavior;
import StrategyPattern.TVBehavior;
import StrategyPatternMembers.LightBlinkBehavior;
import StrategyPatternMembers.LightNormalBehavior;
import StrategyPatternMembers.LightRainbowBehavior;
import StrategyPatternMembers.TVChildBehavior;
import StrategyPatternMembers.TVMovieBehavior;
import StrategyPatternMembers.TVNormalBehavior;
import StrategyPatternMembers.TVSportBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Observer Pattern Test
         * 
         * Person person = new Person("John");
         * 
         * Furniture chair = new Furniture("Chair", new Date(System.currentTimeMillis()
         * + 10000));
         * Furniture table = new Furniture("Table", new Date(System.currentTimeMillis()
         * + 20000));
         * 
         * person.registerObserver(chair);
         * person.registerObserver(table);
         * 
         * while (true) {
         * person.notifyObservers();
         * Thread.sleep(1000);
         * }
         */

        /*
         * Command Pattern Test
         * 
         * 
         * RemoteControl control=new RemoteControl();
         * 
         * //Create Air Conditioner and Command
         * AirConditioner air = new AirConditioner();
         * AirConditionerOff airoff = new AirConditionerOff(air);
         * AirConditionerOn airon = new AirConditionerOn(air);
         * AirConditionerHigh airhigh = new AirConditionerHigh(air);
         * AirConditionerLow airlow = new AirConditionerLow(air);
         * 
         * //Set Command to Remote Controller
         * control.setCommand(0, airon, airoff);
         * control.setCommand(1, airhigh, airlow);
         * 
         * 
         * //Create Air Conditioner and Command
         * MusicPlayer music=new MusicPlayer();
         * MusicPlayerOn musicon=new MusicPlayerOn(music);
         * MusicPlayerOff musicoff =new MusicPlayerOff(music);
         * MusicPlayerDown musicdown=new MusicPlayerDown(music);
         * MusicPlayerUp musicup=new MusicPlayerUp(music);
         * 
         * //Set Command to Remote Controller
         * control.setCommand(2, musicon, musicoff);
         * control.setCommand(3, musicup, musicdown);
         * 
         * Light light = new Light();
         * LightOff lightOff = new LightOff(light);
         * LightOn lightOn = new LightOn(light);
         * control.setCommand(4, lightOn, lightOff);
         * 
         * TV tv = new TV();
         * TVOn tvOn = new TVOn(tv);
         * TVOff tvOff = new TVOff(tv);
         * TVUp tvUp = new TVUp(tv);
         * TVDown tvDown = new TVDown(tv);
         * control.setCommand(5, tvOn, tvOff);
         * control.setCommand(6, tvUp, tvDown);
         * 
         * Command [] onCommand={airon,musicon,tvOn,lightOn};
         * Command [] offCommands={airoff,musicoff,tvOff,lightOff};
         * MacroCommandOn macroCommandOn =new MacroCommandOn(onCommand);
         * MacroCommandOff macroCommandOff =new MacroCommandOff(offCommands);
         * 
         * control.setCommand(7, macroCommandOn, macroCommandOff);
         * 
         * control.onButtonPress(7);
         * System.out.println("----------------------");
         * control.offButtonPress(7);
         * 
         * System.out.println(control.toString());
         */

       /*  RemoteControl control = new RemoteControl();
        Light light = new Light();
        LightOn lightOn = new LightOn(light);
        LightOff lightOff = new LightOff(light);
        LightBehavior[] behaviors = { new LightBlinkBehavior(), new LightNormalBehavior(), new LightRainbowBehavior() };
        control.setCommand(0, lightOn, lightOff);
        control.onButtonPress(0);
        control.offButtonPress(0);
        light.setLightBehavior(behaviors[0]);
        control.onButtonPress(0);
        control.offButtonPress(0);
        behaviors[0] = new LightBlinkBehavior(3);
        light.setLightBehavior(behaviors[0]);
        control.onButtonPress(0);
        control.offButtonPress(0);
        light.setLightBehavior(behaviors[2]);
        control.onButtonPress(0);
        control.offButtonPress(0);

        TV tv = new TV();
        TVOn on = new TVOn(tv);
        TVOff off = new TVOff(tv);
        TVDown down = new TVDown(tv);
        TVUp up = new TVUp(tv);
        control.setCommand(1, on, off);
        control.setCommand(2, up, down);
        control.onButtonPress(1);
        TVBehavior[] behavior = { new TVChildBehavior(), new TVMovieBehavior(), new TVSportBehavior(),
                new TVNormalBehavior() };
        for (int i = 0; i < 3; i++) {
            tv.setBehavior(behavior[i]);
            for (int j = 0; j < 25; j++) {
                control.onButtonPress(2);
                Thread.sleep(200);
            }
            for (int j = 0; j < 25; j++) {
                control.offButtonPress(2);
                Thread.sleep(200);

            }

        }
*/
    }
}
