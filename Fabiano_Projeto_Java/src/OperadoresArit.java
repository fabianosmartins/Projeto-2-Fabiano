import javax.swing.*;

public class OperadoresArit {

	public static void main(String[] args) {
	
		

    Double valor1, valor2;
	Double resultado = null;
	Integer operacao;
	String OP ="";
	
	
	valor1   = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor .:"));
	operacao = Integer.parseInt(JOptionPane.showInputDialog("Opera��o [1 = + | 2 = - | 3 = * | 4 = /]: "));
	valor2   = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor .:"));
	           
	 if (operacao.equals(1)){
	   	resultado = valor1+valor2;
	   	OP = "Soma";
	 }
	 
	 if (operacao.equals(2)) {
		 resultado = valor1 - valor2;
		 OP = "Subtra��o";
 	 }
	 
	 if (operacao.equals(3)) {
		 resultado = valor1 * valor2;
		 OP = "Multiplica��o";
	 }
		
	 if(operacao.equals(4)) {
		 resultado = valor1 / valor2;
		 OP = "Divis�o";
	 }
		
	   JOptionPane.showMessageDialog(null,"Resultado da opera��o de "+ OP+" : " + resultado);
	
	   //showMessageDialog(null,
	 //System.out.println("Resultado da opera��o "+resultado) ; 
	 
	 
	 
  }

}
