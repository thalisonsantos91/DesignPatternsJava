package com.pps.banco.contas;

public class ContaDebEspecial extends ContaEspecial{
   
   public ContaDebEspecial() {
   	super();
   }
   
   ContaDebEspecial(String n,double s, double l){
   	numero = n;
	saldo = s;
	limite = l;
   }
  
  void debitar (double valor) {
    if ((limite + saldo - valor) >= 0) {
    	saldo = saldo - valor;
    }
  }
}

