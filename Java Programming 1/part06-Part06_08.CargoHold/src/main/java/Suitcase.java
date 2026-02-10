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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxTotalWeight;
    
    public Suitcase(int maxTotalWeight){
        this.items = new ArrayList<>();
        this.maxTotalWeight = maxTotalWeight;
        
    }
    
    public void addItem(Item item){
        int totalItemsWeight = 0;
        for(Item itm: this.items){
            totalItemsWeight += itm.getWeight();
        }
        if(totalItemsWeight + item.getWeight() > this.maxTotalWeight){
            return;
        }
        this.items.add(item);
    }
    
    public String toString(){
        int totalItemsWeight = 0;
        for(Item itm: this.items){
            totalItemsWeight += itm.getWeight();
        }
        if(this.items.size() == 0){
            return "no items" + "(" +totalItemsWeight +" kg)";
        }else if(this.items.size()==1){
            return this.items.size() + " item " + "(" +totalItemsWeight +" kg)";
        }
        return this.items.size() + " items " + "(" +totalItemsWeight +" kg)";
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item item:this.items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void printItems(){
        for(Item item:this.items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(int i = 1; i < this.items.size()-1; i++){
            if(this.items.get(i).getWeight() > heaviestItem.getWeight()){
                heaviestItem = this.items.get(i);
                
            }
        }
        return heaviestItem;
    }
}
