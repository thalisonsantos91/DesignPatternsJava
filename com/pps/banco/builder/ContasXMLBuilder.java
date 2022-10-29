package com.pps.banco.builder;

import java.util.Iterator;

import com.pps.banco.contas.Conta;

public class ContasXMLBuilder implements ContasBuilder{
double saldo_total =0;
	@Override
	public String gerarCabecalho() {
		
		return new String("<?<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	}

	@Override
	public String gerarListagemContas(Iterator<Conta> interator) {
	String corpo = "<contas>\n";
	
	Conta c = null;
	 while (iterator.hasNext()) {
		
		c = (Conta)iterator.next();
		corpo = corpo + "\t<conta>\n"+
						"\t\t<numero>"+c.getNumero()+
						"\t\t<saldo>" +c.getSaldo()+
						"\t</conta>\n"+c.getSaldo();
		saldo_total+=c.getSaldo();
	}
	
	corpo  = corpo + "</contas>\n";
	return new String(corpo);
	}
	
	@Override
	public String gerarSumario() {
	
		return null;
	}

}
