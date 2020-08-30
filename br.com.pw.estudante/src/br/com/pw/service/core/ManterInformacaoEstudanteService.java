package br.com.pw.service.core;

import br.com.pw.model.Estudante;
import br.com.pw.service.IManterInformacaoEstudanteService;

public class ManterInformacaoEstudanteService implements IManterInformacaoEstudanteService{

	@Override
	public void salvar(Estudante estudante) {
		if(estudante != null) {
			if(estudante.getDataNascimento() != null &&
					estudante.getDataGraduacao() != null&&		
					estudante.getNis()>0 &&
					!estudante.getNome().trim().equals("") &&
					!estudante.getSenha().trim().equals("")) {
					estudante.setStatus(true);
					estudante.setMatricula("ID exclusivo");
					System.out.println("Registro Salvo!");
					
			
					
			}
		}
		
	}

	@Override
	public void excluir(Estudante estudante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudante consultar(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Estudante estudante) {
		// TODO Auto-generated method stub
		
	}

}
