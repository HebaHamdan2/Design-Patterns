package command;

/**
 *
 * @author HebaHamdan
 */
public class TVoffCommand implements Command {
    TV tv;
    public TVoffCommand(TV tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
    tv.off();
    }

    @Override
    public void undo() {
    tv.setInputChannel();
    tv.on();
    }
    
}
