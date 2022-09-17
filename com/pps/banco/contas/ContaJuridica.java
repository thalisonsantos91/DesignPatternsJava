package com.pps.banco.contas;
import java.util.Date;

abstract class ContaJuridica extends Conta {

	protected double limiteContaJuridica;
	
	protected int numeroConta;
	
	protected int numeroCNPJ;
	
	protected Date dataAberturaContaJurdica;
	
	void creditar(double valor) {
		saldo = saldo + valor;		
	}

	protected double getLimite() {
		return limiteContaJuridica;
	}

	protected void setLimite(double limite) {
		this.limiteContaJuridica = limite;
	}

	public int getNumeroConta(int numeroConta ) {
		return numeroConta;
	}

	public int setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
		return numeroConta;
	}

	protected int getNumeroCNPJ() {
		return numeroCNPJ;
	}

	protected void setNumeroCNPJ(int numeroCNPJ) {
		this.numeroCNPJ = numeroCNPJ;
	}

	void debitar(double valor) {
		 if ((saldo-valor) >= 0) {
		    	saldo = saldo - valor;
		    }	
	}

}
