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
    private JokeManager jokesList;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokesList, Scanner scanner){
        this.jokesList = jokesList;
        this.scanner = scanner;
    }
    
    public void start(){
        
                
        while(true){
            System.out.println("Command: \n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String input = this.scanner.nextLine();
            if(input.equals("X")){
                break;
            }else if(input.equals("1")){
                System.out.println("Write the joke to be added: ");
                String joke = this.scanner.nextLine();
                this.jokesList.addJoke(joke);
                
            }else if(input.equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(this.jokesList.drawJoke());
            }else if(input.equals("3")){
                System.out.println("Printing the jokes.");
                this.jokesList.printJokes();
                }
            }
            
        }
    }
