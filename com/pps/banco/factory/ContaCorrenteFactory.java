package com.pps.banco.factory;

import com.pps.banco.contas.Conta;
import com.pps.banco.contas.ContaCorrente;

import java.util.*;

public class ContaCorrenteFactory extends ContaFactory {

   // private List<Conta> contas = new ArrayList<>();;
    List<Conta> contas = new LinkedList<>();

    public ContaCorrenteFactory(){
    }

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
            System.out.printf("Conta corrente nova: %s  %s\n", c.getNumero(),c.getSaldo());
            System.out.println("****");
        }
    }

    @Override
    public void removerConta(Conta c) {
        contas.remove(c);
    }
}
