package concreteCreator;

import concreteProduct.ArrayIterator;
import creator.Collection;
import product.Iterator;

public class ArrayList extends ArrayIterator implements Collection {

	@Override
	public Iterator iterator() {
		ArrayIterator arrList = new ArrayIterator();
		
		return arrList.next();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
