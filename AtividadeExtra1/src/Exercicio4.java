import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[]marcelo) {
		
		String num1 = JOptionPane.showInputDialog("Digite um número 1");
		String num2 = JOptionPane.showInputDialog("Digite um número 2");
		String operador = JOptionPane.showInputDialog("Digite o operador(+ - * /)");
		
		String resultado = operacao(num1,num2,operador);
		System.out.println(resultado);
		System.exit(0);
		
	}

	private static String operacao(String num1, String num2, String operador) {
		
		Double retorno = null;
		String retornoFormatado = null;
		
		if(operador.equals("+")) {
			retorno = Double.parseDouble(num1) + Double.parseDouble(num2);
			retornoFormatado = "A soma de " + num1 + " + " + num2 + " é igual a: " + retorno.toString();
			
		}
		if(operador.equals("-")) {
			retorno = Double.parseDouble(num1) - Double.parseDouble(num2);
		}
		if(operador.equals("*")) {
			retorno = Double.parseDouble(num1) * Double.parseDouble(num2);
		}
		if(operador.equals("/")) {
			retorno = Double.parseDouble(num1) / Double.parseDouble(num2);
		}
		return retornoFormatado.toString();
	}

}