package Pacote3;

public class Escola {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		
		Aluno aluno1 = new Aluno(); /*Aqui será o João*/
		aluno1.nome = "João";
		System.out.println("Nome do aluno 1 é " + aluno1.nome);
		
		Aluno aluno2 = new Aluno(); /*Aqui será o Pedro*/
		Aluno aluno3 = new Aluno(); /*Aqui será o Alex*/
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("José", 50);
	}
	
}
