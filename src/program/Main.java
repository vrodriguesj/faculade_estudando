package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Aluno;
import entitie.Curso;
import entitie.enums.Status;

public class Main {

	public static void main(String[] args) throws ParseException  {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> list = new ArrayList<>();
		Aluno aluno = new Aluno();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Quantos alunos irá cadastrar? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("");
			System.out.println("Aluno " + i);
			System.out.print("Matricula: ");
			int matricula = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Curso: ");
			String curso = sc.nextLine();
			System.out.print("Status: ");
			String status = sc.next();
			System.out.print("Data de entrada: ");
			Date data = sdf.parse(sc.next());
			System.out.print("Quantidade de notas? ");
			double quantidade = sc.nextInt();
			System.out.print("Digite as 4 notas: ");
			double n1 = sc.nextInt();
			double n2 = sc.nextInt();
			double n3 = sc.nextInt();
			double n4 = sc.nextInt();
			double nota = (n1 + n2 + n3 + n4) / 4;
			list.add(new Aluno(matricula, nome, new Curso(curso), Status.valueOf(status), data, nota));
		}
		
		System.out.println();
		for (Aluno a : list) {
			System.out.println(a);
		}
	}
}
