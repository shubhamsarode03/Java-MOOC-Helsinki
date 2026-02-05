
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    
    public Money plus(Money addition){
        Money moneyObj = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return moneyObj;
        
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
         int thisTotalCents = this.euros * 100 + this.cents;
        int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;
        
        int difference = thisTotalCents - decreaserTotalCents;
        if(thisTotalCents - decreaserTotalCents < 0){
            difference = 0;
        }
        
        int newEuros = difference /100;
        int newCents = difference % 100;
        
        Money moneyObj = new Money(newEuros, newCents);
        
        return moneyObj;
        
    }
}
