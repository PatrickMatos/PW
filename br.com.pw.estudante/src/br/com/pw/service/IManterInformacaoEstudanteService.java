package br.com.pw.service;

import br.com.pw.model.Estudante;

public interface IManterInformacaoEstudanteService {
	public void salvar(Estudante estudante);
	public void excluir(Estudante estudante);
	public Estudante consultar(String matricula);
	public void atualizar(Estudante estudante);
}
