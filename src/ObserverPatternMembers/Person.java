package ObserverPatternMembers;

import java.util.ArrayList;

import ObserverPattern.Observer;
import ObserverPattern.Subject;

public class Person implements Subject{
    
    private String name;
    private ArrayList<Observer> observers;

    Person(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
     

}
