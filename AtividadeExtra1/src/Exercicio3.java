import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String [] marcelo) {
		
	    String numeroDeFuncionarios = JOptionPane.showInputDialog("Qual a quantidade de funcion�rios?");
	    Integer tamanhoVetor = new Integer(numeroDeFuncionarios);
	    int[] vetor = new int[tamanhoVetor.intValue()];
	    
	    int totalSalarioEmpresa = 0;
	    int mediaSalarioEmpresa = 0;
	    for(int i=0,f=0;i<vetor.length;i++) {
	    	f+=+1;
	    	String salarios = JOptionPane.showInputDialog("Qual o sal�rio do funcion�rio n�mero " + f + "?");
	    	totalSalarioEmpresa += Integer.parseInt(salarios);
	    }
	    mediaSalarioEmpresa = totalSalarioEmpresa / vetor.length;
	    System.out.printf("A quantidade de funcion�rios na empresa � '%s'.\n", numeroDeFuncionarios);
	    System.out.printf("A m�dia de sal�rio na empresa � '%s'.\n", mediaSalarioEmpresa);
	    System.exit(0);
	}
}