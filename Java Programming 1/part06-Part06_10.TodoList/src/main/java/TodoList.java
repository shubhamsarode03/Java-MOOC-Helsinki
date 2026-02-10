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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        int taskNumber = 1;
        for(String task:list){
            System.out.println(taskNumber + ": " + task);
            taskNumber +=1;
        }
        
    }
    
    public void remove(int number){
        this.list.remove(number-1);
    }
}
