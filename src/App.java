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

        // Create Person for Subject
        Person person = new Person("John");

        // Create Furnitures for Observer
        Furniture owen = new Furniture("Owen", new Date(System.currentTimeMillis()));
        Furniture washingmachine = new Furniture("Washing Machine", new Date(System.currentTimeMillis()));
        Furniture dishwasher = new Furniture("Dishwasher", new Date(System.currentTimeMillis()));
        Furniture toaster = new Furniture("Toaster", new Date(System.currentTimeMillis()));

        // Command Pattern
        RemoteControl control = new RemoteControl();

        // Create Air Conditioner and Commands
        AirConditioner air = new AirConditioner();
        AirConditionerOff airoff = new AirConditionerOff(air);
        AirConditionerOn airon = new AirConditionerOn(air);
        AirConditionerHigh airhigh = new AirConditionerHigh(air);
        AirConditionerLow airlow = new AirConditionerLow(air);

        // Set Command to Remote Controller air conditioner
        control.setCommand(0, airon, airoff);
        control.setCommand(1, airhigh, airlow);

        // Create Music Player and Commands
        MusicPlayer music = new MusicPlayer();
        MusicPlayerOn musicon = new MusicPlayerOn(music);
        MusicPlayerOff musicoff = new MusicPlayerOff(music);
        MusicPlayerDown musicdown = new MusicPlayerDown(music);
        MusicPlayerUp musicup = new MusicPlayerUp(music);

        // Set Command to Remote Controller for music player
        control.setCommand(2, musicon, musicoff);
        control.setCommand(3, musicup, musicdown);

        // Create Light and Commands
        Light light = new Light();
        LightOff lightOff = new LightOff(light);
        LightOn lightOn = new LightOn(light);

        // Create Behaviors for Light
        LightBehavior[] lightbehaviors = { new LightNormalBehavior(), new LightBlinkBehavior(),
                new LightRainbowBehavior() };

        // Set Command to Remote Controller for Light
        control.setCommand(4, lightOn, lightOff);

        // Create TV and Commands
        TV tv = new TV();
        TVOn tvOn = new TVOn(tv);
        TVOff tvOff = new TVOff(tv);
        TVUp tvUp = new TVUp(tv);
        TVDown tvDown = new TVDown(tv);

        // Create Behaviors for TV
        TVBehavior[] tvbehaviors = { new TVNormalBehavior(), new TVChildBehavior(), new TVMovieBehavior(),
                new TVSportBehavior()
        };

        // Set Command to Remote Controller for TV
        control.setCommand(5, tvOn, tvOff);
        control.setCommand(6, tvUp, tvDown);

        // Create Macro Commands
        Command[] onCommand = { airon, musicon, tvOn, lightOn };
        Command[] offCommands = { airoff, musicoff, tvOff, lightOff };
        MacroCommandOn macroCommandOn = new MacroCommandOn(onCommand);
        MacroCommandOff macroCommandOff = new MacroCommandOff(offCommands);

        // Set Command to Remote Controller for Macro
        control.setCommand(7, macroCommandOn, macroCommandOff);

        // Entering System from here
        Scanner scanner = new Scanner(System.in);
        int closesystem = 0;
        while (closesystem != -1) {
            System.out.println("\nRemote Control for 1 \nFurniture Remote Access for 2\nExit for -1");
            System.out.print("Enter:");
            int choose = 0;
            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Mismatch Enter");
                choose--;
            }
            if (choose == 1) {
                System.out.println(control.toString());
                int closecontrol = 0;
                while (closecontrol != -1) {
                    System.out.println(
                            "On Command for 1\t Off Command for 2 \t Undo for 3 \t Redo for 4 \t Change Mode for 5\t Exit for -1");
                    int optionchoose = 0;
                    try {
                        optionchoose = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Wrong Number");
                    }
                    if (optionchoose == 1) {
                        System.out.println(control.ontoString());
                        System.out.println("Choose Command");
                        int commandchoose = scanner.nextInt();
                        control.onButtonPress(commandchoose);
                    } else if (optionchoose == 2) {
                        System.out.println(control.offtoString());
                        System.out.println("Choose Command");
                        int commandchoose = scanner.nextInt();
                        control.offButtonPress(commandchoose);
                    } else if (optionchoose == 3) {
                        control.undo();
                    } else if (optionchoose == 4) {
                        control.redo();
                    } else if (optionchoose == 5) {
                        System.out.println("TV for 1\t Light for 2");
                        int optionbehavior = scanner.nextInt();
                        if (optionbehavior == 1) {
                            for (int i = 0; i < tvbehaviors.length; i++) {
                                System.out.println("Press " + i + " for " + tvbehaviors[i].toString());
                            }
                            System.out.println("Choose Behavior for TV");
                            int behavior = scanner.nextInt();
                            tv.setBehavior(tvbehaviors[behavior]);
                        } else if (optionbehavior == 2) {
                            for (int i = 0; i < lightbehaviors.length; i++) {
                                System.out.println("Press " + i + " for " + lightbehaviors[i].toString());
                            }
                            System.out.println("Choose Behavior for Light");
                            int behavior = scanner.nextInt();
                            light.setLightBehavior(lightbehaviors[behavior]);
                        }
                    }

                    closecontrol--;
                }
            } else if (choose == 2) {
                
            } else if (choose == -1) {
                closesystem = choose;
            }

        }
        scanner.close();
    }
}
