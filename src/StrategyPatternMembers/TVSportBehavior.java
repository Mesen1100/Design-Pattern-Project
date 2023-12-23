package StrategyPatternMembers;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import StrategyPattern.TVBehavior;

public class TVSportBehavior implements TVBehavior{
    ArrayList<Integer> sportchannel;
    int sayi;
    
    public TVSportBehavior() throws Exception{
        sportchannel=new ArrayList<>();
        //For Run Terminal
        File file=new File("Database/sportchannel.txt");
        //For Run VS code
        // File file=new File("src/Database/sportchannel.txt");

        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            sportchannel.add(scanner.nextInt());
        }
        scanner.close();
        sayi=0;
    }
    @Override
    public int down(int channel) {
        if(sayi==0){
            sayi=sportchannel.size()-1;
        }
        else{
            sayi--;
        }
        return sportchannel.get(sayi);
    }

    @Override
    public int up(int channel) {
        if(sayi==sportchannel.size()-1){
            sayi=0;
        }
        else{
            sayi++;
        }
        return sportchannel.get(sayi);
    }
    public String toString(){
        return "Sport Mode";
    }
}
