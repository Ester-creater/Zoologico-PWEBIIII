package br.com.zoologico.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDao;

public class MamiferoDeletarWhere {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Mamifero mamifero = new Mamifero();
		MamiferoDao mamiferodao = new MamiferoDao(con);
		mamifero.setNome(JOptionPane.showInputDialog("Digite o nome do mamifero que quer apagar: "));
		
		System.out.println(mamiferodao.deletarWhere(mamifero));
		Conexao.fecharConexao(con);

	}

}
