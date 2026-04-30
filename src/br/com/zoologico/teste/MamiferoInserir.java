package br.com.zoologico.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDao;

public class MamiferoInserir {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Mamifero mamifero = new Mamifero();
		MamiferoDao mamiferodao = new MamiferoDao(con);
		
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome do mamifero: "));
		mamifero.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do mamifero: ")));
		mamifero.setMesesGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de meses de gestação: ")));
		System.out.println(mamiferodao.inserir(mamifero));
		Conexao.fecharConexao(con);

	}

}
