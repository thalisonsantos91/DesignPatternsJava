package com.pps.banco.contas;
import java.util.Date;

public class ContaJuridicaSimples extends ContaJuridica{
	
	ContaJuridicaSimples() {
	   	super();
	   }

	ContaJuridicaSimples(double limiteSimples, int numeroContaSimples, int numeroCNPJSimples, Date dataAberturaPJSimples ){
	
	limiteContaJuridica = limiteSimples;
	numeroConta = numeroContaSimples;
	numeroCNPJ = numeroCNPJSimples;
	dataAberturaContaJurdica = dataAberturaPJSimples;
	}

	@Override
	void transferir(double valor) {

	}
}
