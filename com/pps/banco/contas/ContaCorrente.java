package com.pps.banco.contas;

public class ContaCorrente extends Conta {
	
	private double limiteChequeEspecial;

	public ContaCorrente() {
		super();
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	void creditar(double valor) {
		saldo = saldo + valor;
	}

	void debitar(double valor) {
		if ((limiteChequeEspecial + saldo - valor) >= 0) {
	    	saldo = saldo - valor;
	    }
	}

	void transferir(double valor) {
		if ((limiteChequeEspecial + saldo - valor) >= 0) {
	    	saldo = saldo - ((valor * 0.10) + valor);
	    }
	}

}
