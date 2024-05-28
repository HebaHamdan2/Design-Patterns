package strategy;

/**
 *
 * @author HebaHamdan
 */
public class ModelDuck extends Duck{
public ModelDuck(){
quackBehavior=new Quack();
flyBehavior=new FlyNoWay();
}
    @Override
    void display() {
       System.out.println("I'm a real Model duck");  }
    
}
