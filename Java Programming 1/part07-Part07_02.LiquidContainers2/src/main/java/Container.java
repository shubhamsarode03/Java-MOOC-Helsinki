/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarod
 */
public class Container {
    int liquidContain;
    
    public Container(){
        this.liquidContain = 0;
        
    }
    
    public void add(int amount){
        if(amount < 0){
            return;
        }else if(amount >100 ){
            this.liquidContain = 100;
        }else if(amount + this.liquidContain >=100){
            this.liquidContain = 100;
        }else{
            this.liquidContain += amount;
            
        }
    }
    
    public void remove(int amount){
        if(amount <0){
            return;
        }
        if(amount > this.liquidContain){
        this.liquidContain = 0;
        }else{
            this.liquidContain -= amount;
        }
    }
    
    public int contains(){
        return this.liquidContain;
    }
    
    public String toString(){
        return this.liquidContain + "/100";
    }
}
