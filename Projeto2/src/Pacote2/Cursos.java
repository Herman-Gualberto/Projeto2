package Pacote2;

import javax.swing.JOptionPane;

public class Cursos {
	
	public static void main(String[] args) {
		int numero = 0;
		System.out.println("Direito");
		System.out.println("Engenharia");
		System.out.println("Pedagogia");
		
		/*=======================================================*/
		/* Exemplo de for */
		for (numero=0; numero <=21; numero += 3) {
			if (numero == 3 || numero == 9) {   /*operador || é o OR e && é o AND*/
			   System.out.println(" numero = " + numero);
			   continue; /*Funciona como loop*/
			}
			if (numero == 15) { 
			   System.out.println(" numero = " + numero);
			   break; /*Funciona como exit*/
		    }
		System.out.println("valor final do numero = " + numero);
	    }
		
		/*=======================================================*/
		/* Entrada e tratamento de dados */
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
				
		double carrosnumero = Double.parseDouble(carros);
		double pessoasnumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosnumero/pessoasnumero); /*4*/
		double resto = carrosnumero % pessoasnumero;
		JOptionPane.showMessageDialog(null,"Divisão por pessoa deu " + divisao + "carros e sobrou " + resto + "carro");
		
		/*=======================================================*/
		/* Exemplo de Case */
		switch (divisao) {
		case 1: {
			System.out.println("Apenas 1 carro por pessoa");
			break;
		    }
		case 3: {
			System.out.println("São 3 carros por pessoa");
			break;
		    }
		default: System.out.println("São muitos carros por pessoa");
		    break;
		}
		
		/*=======================================================*/
		/* While Do -> Primeiro verifica e depois executa */
		int vez = 0;
		while (vez <= 10) { 
			System.out.println("A variável vez está valendo: " + vez);
			vez += 2;
		}
		
		/*=======================================================*/
		/* Do While -> Primeiro executa e depois verifica */
		do { /*Primeiro executa e depois verifica*/
			System.out.println("A variável vez está valendo: " + vez);
			vez += 2;
		} while (vez <= 10);
		
		/*=======================================================*/
		/* Entrada de Confirmação -> Sim=0, Não=1 e Cancelar=2 */
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja exibir a divisão?");
		if (resposta == 0) {
		   System.out.println("Resultado da divisão é " + divisao);
		}else if (resposta == 1) {
			System.out.println("Não quis ver o resultado da divisão");
		}else {
			System.out.println("Cancelou a pergunta");
		}	
		
		/*=======================================================*/
		/* Cálculo de Média */
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4)/4;
		JOptionPane.showMessageDialog(null,"A média é " + media);
	}
}
