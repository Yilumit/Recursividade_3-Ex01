package controller;
	//Retorna a quantidade de dígitos de um número inteiro 
public class QuantidadeDigitosController {

	public QuantidadeDigitosController() {
		super();
	}
	
	public int funcDigito (double numInt) {
		if(numInt <10 && numInt >-10) {	//Quando o número for menor que 10 quer dizer que ele só possui um dígito (-10 para quando o número que está senod verificado for negativo)
			return 1;
		}else{
			int qntdDigitos = 1 + funcDigito (numInt/10);	//Adiciona +1 à quantidade de dígitos retornados pela funcão
			return qntdDigitos;
		 }

	}

}
