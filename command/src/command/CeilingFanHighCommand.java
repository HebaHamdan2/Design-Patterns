package command;
/**
 *
 * @author HebaHamdan
 */
public class CeilingFanHighCommand implements Command{
  int prevSpeed;
  CeilingFan fan;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan=fan;
       
    }

    @Override
    public void execute() {
    prevSpeed=fan.getSpeed();
    fan.high();
    }

    @Override
    public void undo() {
    if(prevSpeed==CeilingFan.HIGH){
        fan.high();
    }else if(prevSpeed==CeilingFan.LOW){
    fan.low();
    }else if(prevSpeed==CeilingFan.MEDIUM){
    fan.medium();
    }else if(prevSpeed==CeilingFan.OFF){
    fan.off();
    }
    
    {
    
    }
    }
    
  
}
