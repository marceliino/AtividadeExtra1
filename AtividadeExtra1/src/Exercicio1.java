
public class Exercicio1 {
	
	public static void main(String[] marcelo) {
		
		int[] vetor = {1,3,6,9,12};
		exibirOrdemInversa(vetor);
	}

	private static void exibirOrdemInversa(int[] vetor) {
		
		for(int i=0,j=vetor.length;i<vetor.length;i++) {
			j = j - 1;
			System.out.println(vetor[j]);
		}
	}
}