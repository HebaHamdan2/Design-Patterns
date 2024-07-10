package factoryassignment;

/**
 *
 * @author HebaHamdan
 */
public class simpleButtonFactory {
    public Button createDesign(String type){
    Button button=null;
    if(type.equals("rounded")){
    button=new RoundedButton();
    }else if(type.equals("square")){
    button=new SquareButton();
    }
    return button;
    }
}
