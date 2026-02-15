
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;
        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                
                break;
            }
            
            
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")){
                if(container1 >=100){
                    continue;
                }else if(container1 <100 && amount >=0){
                    if(container1 + amount >= 100){
                        container1 =100;
                    }else if(container1 + amount >= 0){
                        container1 += amount;
                    }
                }
                
            }else if(command.equals("move")){
                if(amount >=0){
                if(amount >= container1 && amount+ container2 <=100 ){
                    container2 += container1;
                    container1 = 0;
                }else if( amount < container1 && amount + container2 <=100){
                    container1 -= amount;
                    container2 +=amount;
                }else if(amount >= container1 && amount + container2> 100){
                    container2 = 100;
                    container1 = 0;
                }else if(amount < container1 && amount + container2 >100){
                    container2 = 100;
                    container1 -=amount;
                }
                
            }
            }else if(command.equals("remove")){
                if(amount>= container2){
                    container2 =0;
                }else if(amount < container2 && amount >0){
                    container2-=amount;
                }
            }
            
            
            

        }
    }

}
