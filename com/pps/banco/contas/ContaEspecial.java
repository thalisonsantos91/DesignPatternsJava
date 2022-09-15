package com.pps.banco.contas;
abstract public class ContaEspecial extends Conta {
  
  protected double limite;
  
  public void setLimite ( double value  ) {
    limite = value;
  }
  
  public double getLimite () {
    return limite;
  }
  
  public void creditar ( double valor) {
    saldo = saldo + valor;
  }
}