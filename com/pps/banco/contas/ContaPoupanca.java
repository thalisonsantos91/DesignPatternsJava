package com.pps.banco.contas;

public class ContaPoupanca extends Conta{
	

	void creditar(double valor) {
		saldo = saldo + valor;
	}

	void debitar(double valor) {
		 if ((saldo-valor) >= 0) {
		    	saldo = saldo - valor;
		    }
	}

	@Override
	void transferir(double valor) {
		if ((saldo - valor) >= 0) {
	    	saldo = saldo - ((valor * 0.35) + valor);
	    }

	}

}
