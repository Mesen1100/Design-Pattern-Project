package StrategyPatternMembers;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import StrategyPattern.TVBehavior;

public class TVMovieBehavior implements TVBehavior {
ArrayList<Integer> moviechannel;
    int sayi;
    
    public TVMovieBehavior() throws Exception{
        moviechannel=new ArrayList<>();
        File file=new File("src/Database/moviechannel.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            moviechannel.add(scanner.nextInt());
        }
        scanner.close();
        sayi=0;
    }
    @Override
    public int down(int channel) {
        if(sayi==0){
            sayi=moviechannel.size()-1;
        }
        else{
            sayi--;
        }

        return moviechannel.get(sayi);
    }

    @Override
    public int up(int channel) {
        if(sayi==moviechannel.size()-1){
            sayi=0;
        }
        else{
            sayi++;
        }
        return moviechannel.get(sayi);
    }

}
