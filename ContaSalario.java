import java.util.Date;

public class ContaSalario extends Conta {
	
	protected double limiteContaSalario;

	protected int numeroContaSalario;
	
	protected Date dataAberturaContaSalario;
	
	
	
	void creditar(double valor) {
		saldo = saldo + valor;
	}

	
	void debitar(double valor) {
		if ((saldo-valor) >= 0) {
	    	saldo = saldo - valor;		
		}
	}
	

}
