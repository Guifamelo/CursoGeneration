package exercicio1;
import java.util.Scanner;

public class Exerc�cio1 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner (System.in);
		System.out.println("Informe quantos anos voc� tem: ");
		
		int anos = leia.nextInt();
		System.out.println("Informe quantos meses voc� tem: ");
		int meses = leia.nextInt();
		System.out.println("Informe quantos dias voc� tem: ");
		int dias = leia.nextInt();
		
		dias = anos*365 + meses *30 + dias;
		
		System.out.println("Voc� tem " + dias + " dias de vida.");
	}
	
}
