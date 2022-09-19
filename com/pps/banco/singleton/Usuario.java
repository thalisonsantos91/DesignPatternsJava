package com.pps.banco.singleton;

public class Usuario {
	 
	private static String nome;
	private static String cpf;
	private static String email;
	private static String tipoConta;
	private static Usuario uniqueInstance;
	
	private Usuario(String nome, String cpf, String email, String tipoConta) {
		
		Usuario.nome = nome;
		Usuario.cpf = cpf;
		Usuario.email = email;
		Usuario.tipoConta = tipoConta;
	}
	
	public synchronized static Usuario getUsuarioInstance() {
		
		if(uniqueInstance == null) {
			uniqueInstance = new Usuario("João Aquino Neves", "887.673.340-08", "Joaodev@gmail.com", tipoConta);
		}
		
		return uniqueInstance;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + 
				", CPF = " + cpf +  
				", E-Mail = " + email +
				", Tipo da Conta = " + "3565646263";
	}
	

}
