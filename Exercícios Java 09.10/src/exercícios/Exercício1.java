package exerc�cios;

public class Exerc�cio1 {
	public static void main(String[] args) {
		
		int[] vetor = {1, 0, 5, -2, -5, 7};
		int soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.println("Soma das posi��es 1, 2 e 6 do vetor = " + soma);
		
		vetor[3] = 100; /*Estou interpretando "posi��o quatro" como "a quarta posi��o"*/
		
		for(int i = 0; i<6; i++) {
			System.out.println("Posi��o "+i+" do vetor = "+ vetor[i]);
		}
		
	}
}
