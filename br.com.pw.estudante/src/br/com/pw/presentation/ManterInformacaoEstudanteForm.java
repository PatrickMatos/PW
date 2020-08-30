package br.com.pw.presentation;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.pw.model.Estudante;
import br.com.pw.service.IManterInformacaoEstudanteService;
import br.com.pw.service.core.ManterInformacaoEstudanteService;

public class ManterInformacaoEstudanteForm {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Estudante estudante = new Estudante ();
	
		String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
		String senha = JOptionPane.showInputDialog(null, "Informe a senha:");
		String dataNascimento = JOptionPane.showInputDialog(null, "Informe a Data de Nascimento:");
		String nis = JOptionPane.showInputDialog(null, "Informe o NIS:");
		String dataGraduacao = JOptionPane.showInputDialog(null, "Informe a Data de Graduação prevista:");
	
		estudante.setDataNascimento(new Date(dataNascimento));
		estudante.setNis(Integer.parseInt(nis));
		estudante.setDataGraduacao(new Date(dataGraduacao));
		estudante.setSenha(senha);
		estudante.setNome(nome);
		
		IManterInformacaoEstudanteService manterInformacaoEstudanteService = new ManterInformacaoEstudanteService();
		
		manterInformacaoEstudanteService.salvar(estudante);
		
	}

}
