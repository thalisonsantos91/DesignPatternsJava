package com.pps.banco.contas;

public class ContaCreditoEspecial extends ContaEspecial{
   
   public ContaCreditoEspecial() {
   	super();
   }
   
   ContaCreditoEspecial(String n,double s, double l){
   	numero = n;
	saldo = s;
	limite = l;
   }
  
  void debitar (double valor) {
    if ((limite + saldo - valor) >= 0) {
    	saldo = saldo - valor;
    }
  }

	void transferir(double valor) {
		if ((saldo - valor) >= 0) {
	    	saldo = saldo - ((valor * 0.5) + valor);
	    }
	}
}

