package exerciciosDorColetiva;

public class ex8 {
	public static void main (String[] args) {
		for (int cont1= 1; cont1<=10;cont1++) {
			if(cont1 == 5) {
				continue;
			}
			if(cont1 == 8) {
				break;
			}
		System.out.println(cont1);
		}
	}
}
//Imprima os números de 1 a 10, pulando a impressão do número 5 e interrompendo o loop quando encontrar o número 8. 