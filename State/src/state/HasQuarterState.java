package state;

//import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
        public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
        }
	public String toString() {
		return "waiting for turn of crank";
	}  

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
        public void refill() {}
}
