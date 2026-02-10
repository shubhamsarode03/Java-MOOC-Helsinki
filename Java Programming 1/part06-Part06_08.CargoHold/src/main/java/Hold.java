/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarod
 */
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int suitCasesWeight = 0;
        for(Suitcase suitcse:this.suitcases){
            suitCasesWeight += suitcse.totalWeight();
        }
        if(suitCasesWeight + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        int suitCasesWeight = 0;
        for(Suitcase suitcse:this.suitcases){
            suitCasesWeight += suitcse.totalWeight();
        }
        
        return this.suitcases.size() + " suitcases " + "(" + suitCasesWeight + " kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase:this.suitcases){
            suitcase.printItems();
        }
    }
    
    
}
