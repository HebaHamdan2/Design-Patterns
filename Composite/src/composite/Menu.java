package composite;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
    Iterator<MenuComponent> iterator = null;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
public void add(MenuComponent menuComponent){
menuComponents.add(menuComponent);
}
public void remove(MenuComponent menueComponent){
    menuComponents.remove(menueComponent);
}
public MenuComponent getChild(int i){
return (MenuComponent) menuComponents.get(i);
}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Iterator<MenuComponent> createIterator() {
		if(iterator==null){
                iterator=new CompositeIterator(menuComponents.iterator());
                }
                return iterator;
	}
public void print(){
    System.out.print("\n"+getName());
    System.out.println(","+getDescription());
    Iterator iterator=menuComponents.iterator();
    while(iterator.hasNext()){
     MenuComponent menuComponent=(MenuComponent)iterator.next();
    menuComponent.print();
    }
}	
}