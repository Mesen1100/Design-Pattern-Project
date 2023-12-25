package ObserverPatternMembers;

import java.util.Date;

import ObserverPattern.Observer;

public class Furniture implements Observer {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private String name;
    private Date date;

    public Furniture(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public void display() {
        System.out.println(ANSI_RED+"*********************************************");
        System.out.println("Process is complete for " + name);
        System.out.println("*********************************************"+ANSI_RESET);
    }
    @Override
    public void update() {
        display();
    }
    public String getName() {
        return name;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public Date getDate(){
        return date;
    }
}
