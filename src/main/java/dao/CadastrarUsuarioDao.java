package dao;

import entidade.Usuario;

public interface CadastrarUsuarioDao {

	public boolean InserirUsuario(Usuario usuario);
	
	public boolean AlterarUsuario(Usuario usuario);
	
	public boolean DeletarUsuario(Usuario usuario);
	
	public Usuario pesquisarLogin(String nome);
	
	
}
