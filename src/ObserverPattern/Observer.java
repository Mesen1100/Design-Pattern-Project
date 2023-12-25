package ObserverPattern;

import java.util.Date;

public interface Observer {
    void update();
    void display();
    Date getDate();
}
