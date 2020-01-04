package entitie;

import java.util.Date;

import entitie.enums.Status;

public class Aluno {
	private int matricula;
	private String nome;
	private Status status;
	private Date data;
	private double nota;
	
	private Curso curso;
	
	public Aluno() {
		
	}
	
	public Aluno(int matricula, String nome, Curso curso, Status status, Date data, double nota) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
		this.status = status;
		this.data = data;
		this.nota = nota;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	

	public String toString() {
		return matricula 
				+ "\n"
				+ nome + "\n" 
				+ curso + "\n" 
				+ status + "\n"
				+ data + "\n"
				+ nota + "\n";
	}
}
