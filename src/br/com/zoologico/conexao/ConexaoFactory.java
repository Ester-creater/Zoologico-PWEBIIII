package br.com.zoologico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args) throws SQLException 
	{
		Connection conexao = null;
		//Na linha abaixo, estou armazenando o caminho do BD na variável url
		String url = "jdbc:sqlserver://localhost:1433;databaseName=zoologico;encrypt=false";
		conexao = DriverManager.getConnection(url, "sa", "*123456HAS*");
		System.out.println("Abriu a conexão.");
		conexao.close();

	}

}
