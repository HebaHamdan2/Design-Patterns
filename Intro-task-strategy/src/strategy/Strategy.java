package strategy;

/**
 *
 * @author HebaHamdan
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Duck mallar=new MallardDuck();
       mallar.display();
       mallar.performFly();
       mallar.performQuack();
       mallar.swim();
       
       Duck model=new ModelDuck();
        model.display();
       model.performFly();
       model.performQuack();
       model.swim();
       model.setFlyBehavior(new flyAsRocket());
       model.performFly();
      
         
    
}}
