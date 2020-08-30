package br.com.pw.model;

import java.util.Date;

public class Estudante {
	private String matricula;
	private String senha;
	private String nome;
	private Date dataNascimento;
	private int nis;
	private boolean status; 
	private Date dataGraduacao;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getNis() {
		return nis;
	}
	
	public void setNis(int nis) {
		this.nis = nis;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Date getDataGraduacao() {
		return dataGraduacao;
	}
	
	public void setDataGraduacao(Date dataGraduacao) {
		this.dataGraduacao = dataGraduacao;
	}
	
	
	
	
}
