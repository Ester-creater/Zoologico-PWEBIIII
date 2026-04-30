package br.com.zoologico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.zoologico.beans.Mamifero;

public class MamiferoDao 
{
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public MamiferoDao(Connection con) {
		setCon(con);
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String inserir(Mamifero mamifero) 
	{
		String sql = "insert into mamifero(nome, idade, mesesGestacao) values (?,?,?)";
		try 
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, mamifero.getNome());
			ps.setInt(2, mamifero.getIdade());
			ps.setInt(3, mamifero.getMesesGestacao());
			if (ps.executeUpdate() > 0) 
			{
				return "Inserido com sucesso";
			} else 
			{
				return "Erro inserir";
			}
		} catch (SQLException e)
		{
			return e.getMessage();
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String deletarWhere(Mamifero mamifero) 
	{
		String sql = "delete from mamifero where nome = (?)";
		try 
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, mamifero.getNome());
			if (ps.executeUpdate() > 0) 
			{
				return "Deletado com sucesso";
			} else 
			{
				return "Erro inserir";
			}
		} catch (SQLException e)
		{
			return e.getMessage();
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
