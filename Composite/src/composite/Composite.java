package composite;

/**
 *
 * @author HebaHamdan
 */
public class Composite {

    public static void main(String[] args) {
    MenuComponent pancakeHouseMenu=new Menu("PANCAKE HOUSE MENU ","Breakfast");
    MenuComponent dinnerManu = new Menu("DINER MENU","Lunch");
    MenuComponent cafeMenu=new Menu("CAFE MENU","Dinner");
    MenuComponent desertMenu=new Menu("DESERT MENU","Dessert of course!");
    MenuComponent allMenus=new Menu("ALL MENUS","All menus combined");
    
    dinnerManu.add( new MenuItem("Pasta","Spaghetti with sauce",true,30));
    desertMenu.add(new MenuItem(("Apple Pie"), "Apple pie topped with vanilla icecream", true, 15));
    dinnerManu.add(desertMenu);
    allMenus.add(pancakeHouseMenu);
    allMenus.add(cafeMenu);
    allMenus.add(dinnerManu);
    Waitress waitress=new Waitress(allMenus);
    waitress.printVegetarianMenu();
    
    
    }
    
}
