package state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 public SoldOutState(GumballMachine gumballMachine){
 this.gumballMachine=gumballMachine;
 }
 
	public String toString() {
		return "sold out";
	}

    @Override
    public void insertQuarter() {
        System.out.println("Machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not insrted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs dispensed");
    }

    @Override

    public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	
    }
}
