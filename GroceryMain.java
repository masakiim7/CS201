package Class;

public class GroceryMain {
	
	public static void main(String [] args)
	{
		
		
		GroceryList myList=new GroceryList();
		
		GroceryItemOrder item1=new GroceryItemOrder("rice",1,10);
		GroceryItemOrder item2=new GroceryItemOrder("egg",3,5);
		GroceryItemOrder item3=new GroceryItemOrder("salmon",1,15);
		GroceryItemOrder item4=new GroceryItemOrder("salad",2,5);
		GroceryItemOrder item5=new GroceryItemOrder("soup",2,3);
		GroceryItemOrder item6=new GroceryItemOrder("chips",1,6);
		GroceryItemOrder item7=new GroceryItemOrder("tea",2,3);
		GroceryItemOrder item8=new GroceryItemOrder("ice cream",2,3);
		GroceryItemOrder item9=new GroceryItemOrder("beer",2,3);		

		myList.add(item1);
		myList.add(item2);
		myList.add(item3);
		myList.add(item4);
		myList.add(item5);
		myList.add(item6);
		myList.add(item7);
		myList.add(item8);
		myList.add(item9);

		displayItem(item1,item2,item3,item4,item5,item6,item7,item8,item9);
		System.out.println("Total="+myList.getTotalCost());
		
	}

    public static void displayItem(Object a,Object b,Object c,Object d,Object e,Object f,Object g,Object h,Object i) {
    	System.out.println("Shoppinglist");
    	System.out.println();
    	System.out.println(a.toString());
    	System.out.println(b.toString());
    	System.out.println(c.toString());
    	System.out.println(d.toString());
    	System.out.println(e.toString());
    	System.out.println(f.toString());
    	System.out.println(g.toString());
    	System.out.println(h.toString());
    	System.out.println(i.toString());
    	System.out.println();

    }


	}
