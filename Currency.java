
/**
 * Write a description of class Currency here.
 * 
 * @author 1337-2.0
 * Andrew Wood
 * Philip Coker
 * Weston Harmon
 * Timothy Chacko 
 * @version (a version number or a date)
 */
public class Currency
{
    // instance variables - replace the example below with your own
    private final double TO_EURO = .929651;
    private final double TO_BP = .798750;
    private final double TO_RIYAL = 3.64090;
    private final double TO_RUPEE = 68.0637;

    /**
     * Constructor for objects of class Currency
     */
    public Currency()
    {
        double dollar = 0;
        double euro = dollar*TO_EURO;
        double bp = dollar*TO_BP;
        double riyal = dollar*TO_RIYAL;
        double rupee = dollar*TO_RUPEE;
    }

    public CurrencyConverter (double amount, String currencyType)
    {
        switch (currencyType)
        {
            case "dollar":
                dollar = amount;
                pound = amount* TO_BP;
                rupee = amount* TO_RUPEE;
                riyal = amount * TO_RIYAL;
                euro = amount * TO_EURO;
                break;
                
             case "euro":
                euro = amount;
                dollar = euro*(1/TO_EURO);
                pound = euro*(1/TO_EURO*TO_POUND);
                rupee = euro*(1/TO_EURO*TO_RUPEE);
                riyal = euro*(1/TO_EURO*TO_RIYAL);
                break;
                
              case "BP"
            
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
