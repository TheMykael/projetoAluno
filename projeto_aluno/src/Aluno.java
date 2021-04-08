/**
 * Classe que representa as informações básicas de um aluno.
 * 
 * @author Maycon T. de Almeida
 * @version 1.0.0
 */
public class Aluno {

	String nome;
	String curso;
	int matricula;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	double notaDisciplina1;
	double notaDisciplina2;
	double notaDisciplina3;
	/**
	 * Verifica se o aluno foi aprovado na disciplina 1.
	 * 
	 * 
	 */
	public boolean foiAprovadoDisciplina1() {
		if(notaDisciplina1 >= 7.0) {
			System.out.println("Parabéns, " + this.nome + "! Você foi aprovado(a) nesta disciplina!");
		} else System.out.println(this.nome + ", você infelizmente foi reprovado(a) nesta disciplina. :(");
		return false;
	}
	/**
	 * Verifica se o aluno foi aprovado na disciplina 2.
	 * 
	 * 
	 */
	public boolean foiAprovadoDisciplina2() {
		if(notaDisciplina2 >= 7.0) {
			System.out.println("Parabéns, " + this.nome + "! Você foi aprovado(a) nesta disciplina!");
		} else System.out.println(this.nome + ", você infelizmente foi reprovado(a) nesta disciplina. :(");
		return false;
	}
	/**
	 * Verifica se o aluno foi aprovado na disciplina 3.
	 * 
	 * 
	 */
	public boolean foiAprovadoDisciplina3() {
		if(notaDisciplina3 >= 7.0) {
			System.out.println("Parabéns, " + this.nome + "! Você foi aprovado(a) nesta disciplina!");
		} else System.out.println(this.nome + ", você infelizmente foi reprovado(a) nesta disciplina. :(");
		return false;
	}
}