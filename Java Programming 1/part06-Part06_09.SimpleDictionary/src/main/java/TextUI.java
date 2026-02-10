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
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI( Scanner scanner, SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.print("Command:");
        
        while(true){
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye, bye!");
                break;
            
            }
            if(command.equals("add")){
                String word = scanner.nextLine();
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }
            if(command.equals("search")){
                String searchWord = scanner.nextLine();
                String translatedWord = dictionary.translate(searchWord);
                if(translatedWord == null){
                    System.out.println("Word " + searchWord + " was not found");
                }else{
                System.out.println(dictionary.translate(searchWord));
                }    
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}