import java.util.Date;

import CommandPatternMembers.Commands.AirConditionerHigh;
import CommandPatternMembers.Commands.AirConditionerLow;
import CommandPatternMembers.Commands.AirConditionerOff;
import CommandPatternMembers.Commands.AirConditionerOn;
import CommandPatternMembers.Furnitures.AirConditioner;
import CommandPatternMembers.Furnitures.RemoteControl;
import ObserverPatternMembers.Furniture;
import ObserverPatternMembers.Person;

public class App {
    public static void main(String[] args) throws Exception {
        /*  Observer Pattern Test
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

        /*  Command Pattern Test
         * 
         * AirConditioner air = new AirConditioner();
         * AirConditionerOff off = new AirConditionerOff(air);
         * AirConditionerOn on = new AirConditionerOn(air);
         * AirConditionerHigh high = new AirConditionerHigh(air);
         * AirConditionerLow low = new AirConditionerLow(air);
         * RemoteControl control = new RemoteControl();
         * control.setCommand(0, on, off);
         * control.setCommand(1, high, low);
         * control.toString();
         * 
         */
    }
}
