package Pacote3;
/*Esta é a no classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos do aluno*/
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Aluno() { /*Cria os dados na memoria - Sendo padrao do java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;		
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	/*Método que retorn a media do aluno*/
	public double getMediaNota() {
	   return (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	/*Método que retorna true para aprovado e false para reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70 ) {
			return true;
		}else {
			return false;
		}
	}		
	
	/*Método que retorna o resultado conforme a média*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 70 ) {
			return "Aluno está aprovado";
		}else if (media < 70 && media > 40) {
			return "Aluno está em recuperação";
		}else {
			return "Aluno está em reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ "]";
	}		

	
}

