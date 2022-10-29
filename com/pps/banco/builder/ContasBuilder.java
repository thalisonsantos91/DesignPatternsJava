package com.pps.banco.builder;

import java.util.Iterator;

import com.pps.banco.contas.Conta;


public interface ContasBuilder {
	
	abstract String gerarCabecalho();
	abstract String gerarListagemContas(Iterator <Conta> interator);
	abstract String gerarSumario();
	
	

}
