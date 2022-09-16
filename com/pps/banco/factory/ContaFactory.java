package com.pps.banco.factory;

import com.pps.banco.contas.Conta;

import java.util.Collection;

public abstract class ContaFactory {
    protected Collection<Conta> conta;

    public abstract void criarConta(String numeroConta, double saldo);

    public abstract void listarConta();

    public abstract void removerConta(Conta c);

}
