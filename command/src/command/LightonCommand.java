package command;

/**
 *
 * @author HebaHamdan
 */
public class LightonCommand implements Command{
    Light light;
    public LightonCommand(Light light){
    this.light=light;
    }
    @Override
    public void execute() {
    light.on();
    }
 
    @Override
    public void undo() {
    light.off();
    }
    
    
}
