package composite;
import java.util.Iterator;
  
public class NullIterator implements Iterator<MenuComponent> {
   
	
        @Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

    @Override
    public boolean hasNext() {
    return false;
    }

    @Override
    public MenuComponent next() {
    return null;
    }
	
}