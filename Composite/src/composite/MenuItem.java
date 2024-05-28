package composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
public Iterator createIterator(){
return new NullIterator();
}
        @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

        @Override
	public boolean isVegetarian()
        {
        return vegetarian;
        }
        
        @Override
        public void print(){
            System.out.print(" "+getName());
            if(isVegetarian()){
                System.out.print("V");}
            System.out.println(","+getPrice());
            System.out.println("--"+getDescription());
        }
}