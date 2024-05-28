package command;

/**
 *
 * @author HebaHamdan
 */
public class CeilingFanoffCommand implements Command{
CeilingFan fan;
int prevSpeed;
    public CeilingFanoffCommand(CeilingFan fan) {
        this.fan=fan;
    }

    @Override
    public void execute() {
    prevSpeed=fan.getSpeed();
    fan.off();
    }

    @Override
    public void undo() {
    if(prevSpeed==CeilingFan.HIGH){
    fan.high();
    }else if(prevSpeed==CeilingFan.MEDIUM){
    fan.medium();
    }else if(prevSpeed==CeilingFan.LOW){
    fan.low();
    }else if(prevSpeed==CeilingFan.OFF){
    fan.low();
    }
    }
    

  
}
