package com.pps.banco.factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pps.banco.contas.Conta;
import com.pps.banco.contas.ContaCorrente;

public class ContaPoupancaFactory extends ContaFactory{
	
	private List<Conta> contas = new ArrayList<>();;

	@Override
	public void criarConta(String numeroConta, double saldo) {
		Conta c = new ContaCorrente();
        c.setNumero(numeroConta);
        c.setSaldo(saldo);
        contas.add(c);
		
	}

	@Override
	public void listarConta() {
		Iterator<Conta> iterator = contas.iterator();
        Conta c = null;
        while(iterator.hasNext()) {
            c = (Conta)iterator.next();
            System.out.printf("Conta Poupança nova:%s  %s\n", c.getNumero(), c.getSaldo());
            System.out.println("****");
        }
		
	}

	@Override
	public void removerConta(Conta c) {
		contas.remove(c);
		
	}

}
