package exerc�cio2;
	import java.util.*;

public class Exerc�cio2 {
	private static Scanner leia;
	public static void main (String[] args) {
		leia = new Scanner(System.in);
		
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		int a,b,c,flex;
		boolean ok = false;
		System.out.println("Insira o valor de A");
		a = leia.nextInt();
		System.out.println("Insira o valor de B");
		b = leia.nextInt();
		System.out.println("Insira o valor de C");
		c = leia.nextInt();
		
		do {
			if (c < b) {
				flex = b;
				b = c;
				c= flex;
			}
			if (b < a) {
				flex = a;
				a = b;
				b = flex;
			}
			if (a <= b && b <= c) {
				ok  = true;
			}
		} while (!ok);
		
		System.out.println("N�meros ordenados: " + a + " " + b + " " + c);
	}
}
