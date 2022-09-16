package com.pps.banco.contas;

abstract public class Conta {
  
  protected String numero;
  
  protected double saldo;
  
  public String getNumero (  ) {
    return numero;
  }
  
  public void setNumero ( String value  ) {
    numero = value;
  }
  
  public double getSaldo (  ) {
    return saldo;
  }
  
  public void setSaldo ( double value  ) {
    saldo = value;
  }
  
  abstract void creditar (double valor);
  
  abstract void debitar (double valor);
  
  abstract void transferir (double valor);
}

