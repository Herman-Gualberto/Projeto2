package Pacote3;

public class Escola {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("18/10/1987");
		aluno1.setRegistroGeral("16.642.338-3");
		aluno1.setNumeroCpf("108.642.338-03");
		aluno1.setNomeMae("Shirlei");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setNomeEscola("Java Shcool");
		aluno1.setSerieMatriculado("5");

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
