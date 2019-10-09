 

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
        history = "";
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
        total += value;
    }

    /**
     * Subtracts the value and the total value of the adding machine
     * 
     * @param value the value to be subtracted from the adding machine
     */ 
    public void subtract (int value) {
        
        total -= value;
    }
        
    /**
     * Returns the value of the adding machine as a string
     */
    public String toString () {
        return history + Integer.toString( total );
    }

    /**
     * Clears the adding machine
     */
    public void clear() {
        history = "";
    }
}
