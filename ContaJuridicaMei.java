import java.util.Date;

public class ContaJuridicaMei extends ContaJuridica {

	ContaJuridicaMei() {
		   	super();
		   }
	
	ContaJuridicaMei(double limiteMei, int numeroContaMei, int numeroCNPJMei, Date dataAberturaPJMei){
		
		limiteContaJuridica = limiteMei;
		numeroConta = numeroContaMei;
		numeroCNPJ = numeroCNPJMei;
		dataAberturaContaJurdica = dataAberturaPJMei;
	}
}
