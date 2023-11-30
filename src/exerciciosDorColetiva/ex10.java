package exerciciosDorColetiva;

public class ex10 {
	public static void main (String[] args) {
		int [] numeros = {5,4,3,2,1,0,-1,-2,-3,-4,-5};
		for (int cont : numeros) {
			if(cont<0) {
				break;
			}
			System.out.println(cont);
		}
	}
}

//Dado um array de números inteiros, imprima cada número até encontrar um número negativo. Use break para interromper o loop nesse ponto. 