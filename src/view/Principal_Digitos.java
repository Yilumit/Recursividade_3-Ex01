package view;
	//Exibe a quantidade de dígitos de um número inteiro 

import controller.QuantidadeDigitosController;

public class Principal_Digitos {

	public static void main(String[] args) {
		QuantidadeDigitosController cMet = new QuantidadeDigitosController();
		int num =-1567;
		
		System.out.println("Quantidade de digitos do número "+num+": "+cMet.funcDigito(num));

	}

}
