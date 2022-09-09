package Pacote3;

import javax.swing.JOptionPane;

public class Escola {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nacimento?");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");
		String nomeEscola = JOptionPane.showInputDialog("Nome da escola?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("Nome é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("Data de Nascimento é " + aluno1.getDataNascimento());
		System.out.println("Número do Registro Geral é " + aluno1.getRegistroGeral());
		System.out.println("Número do CPF é " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe é " + aluno1.getNomeMae());
		System.out.println("Nome do Pai é " + aluno1.getNomePai());
		System.out.println("Data de Matrícula é " + aluno1.getDataMatricula());
		System.out.println("Nome da Escola é " + aluno1.getNomeEscola());
		System.out.println("Série Matriculado é " + aluno1.getSerieMatriculado());
		
		System.out.println("Média da Nota é " + aluno1.getMediaNota());
		System.out.println("Resultado é " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Média significa que " + aluno1.getAlunoAprovado2());
		/*======================================================================*/
		
		//Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		//System.out.println("Nome do aluno 1 é " + aluno1.nome);
		//System.out.println("Idade é " + aluno1.idade);
	
		//Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		//Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
		//Aluno aluno4 = new Aluno("Maria");
		//Aluno aluno5 = new Aluno("José", 50);
	
	}
	
}
