/**
 * Classe responsável por executar o método main do programa Aluno.
 */
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
	Scanner sc = new Scanner(System.in);
	Aluno aluno = new Aluno();
	
	// Cadastro aluno
	System.out.println("Aluno(a), digite seu nome para cadastro:");
	aluno.nome = sc.nextLine();
	System.out.println("Ok, " + aluno.nome + "! Agora digite seu curso:");
	aluno.curso = sc.nextLine();
	aluno.matricula = 000;
	System.out.println("Ótimo! seu R.A agora é: " + aluno.matricula);
	
	// Disciplina 1
	System.out.println(aluno.nome + ", insira o nome da sua disciplina 1");
	aluno.disciplina1 = sc.nextLine();
	System.out.println("Sua disciplina 1 é: " + aluno.disciplina1);
	
	System.out.println("Insira a sua nota da disciplina: " + aluno.disciplina1);
	aluno.notaDisciplina1 = sc.nextDouble();
	
	System.out.println("Para saber se foi aprovado(a), digite: (S)");
	System.out.println(aluno.nome + ", caso não queira saber sua nota ainda, digite qualquer outro caractere.");
	sc.nextLine();
	
	char saberNota1 = sc.nextLine().charAt(0);
	if(saberNota1 == 'S') {
		aluno.foiAprovadoDisciplina1();
	} else {
		System.out.println(aluno.nome + ", independente de sua nota, sabemos que você consegue :)");
	}
	
	// Disciplina 2
	System.out.println("Agora, insira o nome da sua disciplina 2");
	aluno.disciplina2 = sc.nextLine();
	System.out.println("Sua disciplina 2 é: " + aluno.disciplina2);
	
	System.out.println("Insira a sua nota da disciplina: " + aluno.disciplina2);
	aluno.notaDisciplina2 = sc.nextDouble();
	
	System.out.println("Para saber se foi aprovado(a), digite: (S)");
	System.out.println(aluno.nome + ", caso não queira saber sua nota ainda, digite qualquer outro caractere.");
	sc.nextLine();
	
	char saberNota2 = sc.nextLine().charAt(0);
	if(saberNota2 == 'S') {
		aluno.foiAprovadoDisciplina2();
	} else {
		System.out.println(aluno.nome + ", independente de sua nota, sabemos que você consegue :)");
	}
	
	// Disciplina 3
	System.out.println("Agora, insira o nome da sua disciplina 3");
	aluno.disciplina3 = sc.nextLine();
	System.out.println("Sua disciplina 3 é: " + aluno.disciplina3);
	
	System.out.println("Insira a sua nota da disciplina: " + aluno.disciplina3);
	aluno.notaDisciplina3 = sc.nextDouble();
	
	System.out.println("Para saber se foi aprovado(a), digite: (S)");
	System.out.println(aluno.nome + ", caso não queira saber sua nota ainda, digite qualquer outro caractere.");
	sc.nextLine();
	
	char saberNota3 = sc.nextLine().charAt(0);
	if(saberNota3 == 'S') {
		aluno.foiAprovadoDisciplina3();
	} else {
		System.out.println(aluno.nome + ", independente de sua nota, sabemos que você consegue :)");
	}
	sc.close();	
	}
}