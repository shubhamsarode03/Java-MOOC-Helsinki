/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sarod
 */
import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList tasks;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.tasks = list;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.print("To add: ");
                String  taskToAdd = scanner.nextLine();
                tasks.add(taskToAdd);
            }else if(command.equals("list")){
                tasks.print();
            }else if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int number = scanner.nextInt();
                tasks.remove(number);
            }
        }
    }
}
