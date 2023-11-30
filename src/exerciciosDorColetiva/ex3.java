package exerciciosDorColetiva;

public class ex3 {
	public static void main (String[] args) {
		for (int cont1= 1; cont1<=4;cont1++) {
		System.out.println("Loop "+cont1);
		for (int cont = 1; cont <=5 ; cont++) {
			if (cont==3) {
				break;
			}
			System.out.println(cont);
		}
		System.out.println("Fim loop "+cont1);
		}
	}
}
//Crie um loop aninhado que imprima os números de 1 a 5 para cada iteração do loop externo. Use break para interromper o loop interno quando o número 3 for atingido. 