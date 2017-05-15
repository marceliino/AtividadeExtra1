import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] marcelo) {
		
		String numeroEntrada = JOptionPane.showInputDialog("Digite um número");
		fatorial(numeroEntrada);
	}

	private static void fatorial(String numero) {
		
		int numeroFatorial = Integer.parseInt(numero);
		int fatorial = 1;
		StringBuilder resultado = new StringBuilder();
		resultado.append(numeroFatorial + "!=");
		int j = numeroFatorial;
		
		for(int i=1;i<=numeroFatorial;i++) {
			fatorial = fatorial * i;
			resultado.append(j--);
			if(j>=1) {
				resultado.append(".");
			}
		}
		System.out.println("Resultado do fatorial de: " + resultado + "=" + fatorial);
	}
}