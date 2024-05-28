package state;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
  public NoQuarterState(GumballMachine gumballMachine){
  this.gumballMachine=gumballMachine;
  }
  
    
	public String toString() {
		return "waiting for quarter";
	}

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");    
    }
	public void refill() { }
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}

