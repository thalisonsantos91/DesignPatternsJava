package product;

import java.util.ArrayList;

import contas.Conta;

public interface Iterator {
	
	public abstract boolean hasNext();
	
	public abstract Iterator next();
	
	public abstract void remove();
	
}

