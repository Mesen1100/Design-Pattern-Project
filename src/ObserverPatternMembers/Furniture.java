package ObserverPatternMembers;

import java.util.Date;

import ObserverPattern.Observer;

public class Furniture implements Observer {
    private String name;
    private Date date;

    public Furniture(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void display() {
        System.out.println("Process is complete for " + name);
    }
    @Override
    public void update() {
        Date newdate = new Date(System.currentTimeMillis());
        if(newdate.after(this.date)) {
            display();
        }
    }
    public String getName() {
        return name;
    }
    public void setDate(Date date){
        this.date=date;
    }
}
