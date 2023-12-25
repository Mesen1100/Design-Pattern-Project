import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

        Furniture[] furnitures = { owen, washingmachine, dishwasher, toaster };

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

        System.out.println(" W      W  EEEEE  L      CCCC   OOO   M      M  EEEEE");
        System.out.println(" W      W  E      L     C      O   O  M M  M M  E    ");
        System.out.println(" W  W   W  EEEE   L     C      O   O  M  MM  M  EEEE ");
        System.out.println(" W W  W W  E      L     C      O   O  M      M  E    ");
        System.out.println(" W      W  EEEEE  LLLLL  CCCC   OOO   M      M  EEEEE");
        System.out.println();

        System.out.println("    A     U   U  TTTTT  OOO   M   M      A     TTTTT  I   OOO  N   N");
        System.out.println("   A A    U   U    T   O   O  MM MM     A A      T    I  O   O NN  N");
        System.out.println("  A   A   U   U    T   O   O  M M M    A   A     T    I  O   O N N N");
        System.out.println(" AAAAAAA  U   U    T   O   O  M   M   AAAAAAA    T    I  O   O N  NN");
        System.out.println("A       A  UUU     T    OOO   M   M  A       A   T   III  OOO  N   N");
        System.out.println();

        System.out.println("--------------------------------------------------------------");
        System.out.println("------------WELCOME TO HOME AUTOMATION SYSTEM-----------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        // ANSI escape code for green color
        final String ANSI_GREEN = "\u001B[32m";
        // ANSI escape code to reset color
        final String ANSI_RESET = "\u001B[0m";

        // Displaying the initial loading message
        System.out.print("Loading: ");

        // Simulating progress by incrementing the progress bar
        for (int i = 0; i <= 100; i += 5) {
            System.out.print("[");
            int j;
            for (j = 0; j < i / 2; j++) {
                System.out.print("#");
            }
            for (; j < 50; j++) {
                System.out.print(" ");
            }

            // Color the completed part of the progress bar in green
            if (i == 100) {
                System.out.print(ANSI_GREEN + "]" + ANSI_RESET);
                System.out.print(ANSI_GREEN + " " + i + "%" + ANSI_RESET);
            } else {
                System.out.print("]");
                System.out.print(" " + i + "%");
            }

            
            System.out.print("\r"); // Move the cursor back to the beginning of the line

            // Simulate progress taking time (here, it's just for demonstration)
            TimeUnit.MILLISECONDS.sleep(100);
        }

        System.out.println("\nLoading complete.");
        System.out.println("System is ready to use");
        System.out.println();

        // Entering System from here
        Scanner scanner = new Scanner(System.in);
        int closesystem = 0;
        while (closesystem != -1) {
            person.notifyObservers();
            System.out.println("---------------#####################-----------------");
            System.out.println("\nRemote Control for 1 \nFurniture Remote Access for 2\nRefresh for 3\nExit for -1");
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
                for (int i = 0; i < furnitures.length; i++) {
                    System.out.println("Press " + i + " for " + furnitures[i].getName());
                }
                int optionfurniture = scanner.nextInt();
                System.out.println("Time for " + furnitures[optionfurniture].getName());
                System.out.print("Enter Minute Format:");
                int time = scanner.nextInt();
                furnitures[optionfurniture].setDate(new Date(System.currentTimeMillis() + (time * 60000)));
                person.registerObserver(furnitures[optionfurniture]);

            } else if (choose == 3) {

            } else if (choose == -1) {
                closesystem = choose;
            }

        }
        scanner.close();
    }
}
