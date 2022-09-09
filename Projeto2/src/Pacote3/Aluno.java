package Pacote3;
/*Esta é a no classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos do aluno*/
	public String nome;
	public int idade;
	public String dataNascimento;
	public String registroGeral;
	public String numeroCpf;
	public String nomeMae;
	public String nomePai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;

	public Aluno() { /*Cria os dados na memoria - Sendo padrao do java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;		
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
