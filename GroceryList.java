package Class;

public class GroceryList {
    public static final int MAX_ITEMS = 10;

    private GroceryItemOrder[] items;
    private int numItems;

    public GroceryList() {
        items = new GroceryItemOrder[MAX_ITEMS];
        numItems = 0;
    }

    public void add(GroceryItemOrder item) {
        items[numItems] = item;
        numItems++;
    }
    
    public GroceryItemOrder get(int i) {
    	return items[i];
    }

    public double getTotalCost() {
        double cost = 0.0;
        for (int i = 0; i < numItems; i++) {
            cost += items[i].getCost();
        }
        return cost;
    }
}
    

