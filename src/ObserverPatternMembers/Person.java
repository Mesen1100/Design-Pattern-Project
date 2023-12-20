package ObserverPatternMembers;

import java.util.ArrayList;

import ObserverPattern.Observer;
import ObserverPattern.Subject;

public class Person implements Subject{
    @Override
    public ArrayList<Observer> observers() {
        return new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers().add(observer);
        
    }
    @Override
    public void removeObserver(Observer observer) {
        observers().remove(observer);
        
    }

}
