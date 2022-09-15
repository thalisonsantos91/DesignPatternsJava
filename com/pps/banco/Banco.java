package com.pps.banco;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import com.pps.banco.contas.Conta;
import com.pps.banco.contas.ContaDebEspecial;
import com.pps.banco.contas.ContaNormal;

import java.util.Iterator;
import java.util.LinkedList;

public class Banco {
	
	private static List<Conta> contas;
	
	Banco(){
		contas = contas();
	}
	
	private List<Conta> contas(){
		List<Conta> contas = new LinkedList<>();
		return contas;
	}
	
	private void CriaConta(Conta c) {
		contas.add(c);
	}
	
	private void ListaContas() {
		Iterator<Conta> iterator = contas.iterator();
		Conta c = null;
	    while(iterator.hasNext()) {
	      c = (Conta)iterator.next();
	      System.out.printf("Conta %s  %s\n", c.getNumero(), c.getSaldo()); 
	    }
	}
	
	
	public static void main (String args[]) {
		Banco banco = new Banco();
		
		Conta contaNomal = new ContaNormal();
		contaNomal.setNumero(new String("1654-3"));
		contaNomal.setSaldo(500);
		
		banco.CriaConta(contaNomal);
		
		ContaDebEspecial contaDebEspecial = new ContaDebEspecial();
		contaDebEspecial.setNumero(new String("4067-6"));
		contaDebEspecial.setSaldo(2500);
		contaDebEspecial.setLimite(1000.67);
		
		banco.CriaConta(contaDebEspecial);
		banco.ListaContas();
	}
}