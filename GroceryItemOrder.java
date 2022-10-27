package Class;

public class GroceryItemOrder 
{
     String name;
     int quantity;
     double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) 
    {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() 
    {
        return quantity * pricePerUnit;
    }

    public void setQuanity(int quantity) 
    {
        this.quantity = quantity;
    }

    public String toString() 
    {
        return quantity + " of " + name;
    }
    

}