package com.pps.banco.contas;

public class ContaEstudantil extends Conta {
	
	protected double limiteContaSalario;

	void creditar(double valor)  {
		saldo = saldo + valor;
	}

	void debitar(double valor) {
		if ((limiteContaSalario + saldo - valor) >= 0) {
			saldo = saldo - valor;
		}
	}

	void transferir(double valor) {
		if ((limiteContaSalario + saldo - valor) >= 0) {
			saldo = saldo - ((valor * 0.15) + valor);
		}
	}

}
