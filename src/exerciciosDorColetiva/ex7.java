package exerciciosDorColetiva;

public class ex7 {
	public static void main (String[] args) {
		for (int cont1= 1; cont1<=5;cont1++) {
			if(cont1 == 3) {
				break;
			}
			switch(cont1) {
			  case 1:
			    System.out.println("Primeiro lugar.");
			    break;
			  case 2:
				  System.out.println("Segundo lugar.");
			    break;
			  case 3:
				    System.out.println("Terceiro lugar.");
				    break;
				  case 4:
					  System.out.println("Quarto lugar.");
				    break;
				  case 5:
					  System.out.println("Quinto lugar.");
				    break;
			  default:
				  System.out.println("Algum erro ocorreu.");
			}
		}
	}
}

//Use um loop para iterar sobre os números de 1 a 5. Pare o loop quando encontrar o número 3. Use switch para imprimir uma mensagem diferente para cada número. 
