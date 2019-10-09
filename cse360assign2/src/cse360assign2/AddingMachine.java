package cse360assign2; 

public class AddingMachine {

    /** 
     * The total value of the adding machine that is getting modified
     */
    private int total;
    private String history;
    
    /** 
     * Initial call that sets the total value
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }
    
    /**
     * Returns the total value of the adding machine
     */
    public int getTotal () {
        return total;
    }
    
    /**
     * Adds the value to the total value of the adding machine
     * 
     * @param value the value to be added to the adding machine
     */
    public void add (int value) {
        history += " + " + Integer.toString( value );
        total += value;
    }

    /**
     * Subtracts the value and the total value of the adding machine
     * 
     * @param value the value to be subtracted from the adding machine
     */ 
    public void subtract (int value) {
        history += " - " + Integer.toString( value );
        total -= value;
    }
        
    /**
     * Returns the value of the adding machine as a string
     */
    public String toString () {
        return history;
    }

    /**
     * Clears the adding machine
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}
