package ObserverPatternMembers;

import java.util.ArrayList;
import java.util.Date;

import ObserverPattern.Observer;
import ObserverPattern.Subject;

public class Person implements Subject{
    
    private String name;
    private ArrayList<Observer> observers;

    public Person(String name){
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
    
    public void notifyObservers() {
        for(int i =0;i<observers.size();i++) {
            Date newdate = new Date(System.currentTimeMillis());
            if(newdate.after(observers.get(i).getDate())) {
                observers.get(i).update();
                removeObserver(observers.get(i));
            }
        }
    }
    
     

}
