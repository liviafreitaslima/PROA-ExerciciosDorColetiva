package exerciciosDorColetiva;

import java.util.Scanner;

public class ex9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 1;
		for (int cont1= 1; valor!=0;cont1++) {
		System.out.println("Insira um número, essa ação será repetida até o número for igual a 0.");
		
		valor = sc.nextInt();
		
		System.out.println(cont1+"° Loop. O número inserido foi: "+valor);
		}
		
		System.out.println ("Loop encerrado.");
	}
}
//Crie um loop infinito que solicita ao usuário um número. Pare o loop quando o número 0 for inserido.