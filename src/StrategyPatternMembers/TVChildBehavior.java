package StrategyPatternMembers;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import StrategyPattern.TVBehavior;

public class TVChildBehavior implements TVBehavior {

    ArrayList<Integer> childchannel;
    int sayi;
    
    public TVChildBehavior() throws Exception{
        childchannel=new ArrayList<>();
        //For Run Terminal 
        File file=new File("Database/childchannel.txt");
        //For Run Vs Code
        //File file=new File("src/Database/childchannel.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            childchannel.add(scanner.nextInt());
        }
        scanner.close();
        sayi=0;
    }
    @Override
    public int down(int channel) {
        if(sayi==0){
            sayi=childchannel.size()-1;
        }
        else{
            sayi--;
        }

        return childchannel.get(sayi);
    }

    @Override
    public int up(int channel) {
        if(sayi==childchannel.size()-1){
            sayi=0;
        }
        else{
            sayi++;
        }
        return childchannel.get(sayi);
    }
}
