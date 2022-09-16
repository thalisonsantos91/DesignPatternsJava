package com.pps.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import com.pps.banco.contas.Conta;
import com.pps.banco.contas.ContaCreditoEspecial;
import com.pps.banco.contas.ContaNormal;
import com.pps.banco.factory.ContaCorrenteFactory;
import com.pps.banco.factory.ContaFactory;

import java.util.Iterator;
import java.util.LinkedList;

public class Banco {

    private static List<Conta> contas;

    Banco() {
        contas = contas();
    }

    private List<Conta> contas() {
        List<Conta> contas = new LinkedList<>();
        return contas;
    }

    private static void CriaConta(Conta c) {
        contas.add(c);
    }

    private static void ListaContas() {
        Iterator<Conta> iterator = contas.iterator();
        Conta c = null;
        while (iterator.hasNext()) {
            c = (Conta) iterator.next();
            System.out.printf("Conta %s  %s\n", c.getNumero(), c.getSaldo());
        }
    }


    public static void main(String args[]) {

        ContaFactory contaCorrente = new ContaCorrenteFactory();
        contaCorrente.criarConta("434325", 2000);
        contaCorrente.criarConta("234535", 1000);
        contaCorrente.criarConta("345334", 500);

        contaCorrente.listarConta();
    }
}