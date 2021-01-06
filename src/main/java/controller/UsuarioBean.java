package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UsuarioDaoImplements;
import entidade.Usuario;

@ManagedBean(name="CadastroUsuarioBean")
@SessionScoped
public class UsuarioBean {

	private Usuario usuario;
	private UsuarioDaoImplements dao;
	
	public UsuarioBean() {
		this.usuario = new Usuario();
		this.dao = new UsuarioDaoImplements();
	}
	
	public void Cadastrar(){
		this.dao.InserirUsuario(usuario);
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDaoImplements getDao() {
		return dao;
	}

	public void setDao(UsuarioDaoImplements dao) {
		this.dao = dao;
	}
}
