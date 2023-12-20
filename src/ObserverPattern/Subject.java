package ObserverPattern;

import java.util.ArrayList;

public interface Subject {
    ArrayList<Observer> observers();

    void registerObserver(Observer observer);
    
    void removeObserver(Observer observer);

    
}
