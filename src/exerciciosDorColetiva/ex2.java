package exerciciosDorColetiva;

public class ex2 {
	public static void main (String[] args) {
		for (int cont = 1; cont <=10 ; cont++) {
			if (cont%2==0) {
				continue;
			}
			System.out.println(cont);
		}
	}
}
//Imprima os números ímpares de 1 a 10, usando continue para pular os números pares. 