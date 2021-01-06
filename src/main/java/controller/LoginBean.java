package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

import dao.UsuarioDaoImplements;
import entidade.Usuario;
import jdk.nashorn.internal.runtime.Context;

@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean {

	private String nomeBean;
	private String senhaBean;

	private Usuario usuario;
	private UsuarioDaoImplements dao;

	public LoginBean() {
		this.usuario = new Usuario();
		this.dao = new UsuarioDaoImplements();
	}

	public void verificarLogin() {
		FacesMessage message = null;
		boolean loggedIn = false;
		
		Usuario login = this.dao.pesquisarLogin(nomeBean);


		if(login.getNome() != null && login.getNome().equals(nomeBean)){
			Usuario senha = login;
			if (senha.getSenha().equals(senhaBean)) {
				loggedIn = true;
	            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem Vindo!", nomeBean);
	           	            
	            
			} else {
	            loggedIn = false;
	            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuário ou senha Invalido!", "errado");
	        }
				
		FacesContext.getCurrentInstance().addMessage(null, message);
		PrimeFaces.current().ajax().addCallbackParam("index.xhtml", loggedIn);
		
			
		
	
	}
	
}
		
	
	public String getNomeBean() {
		return nomeBean;
	}

	public void setNomeBean(String nomeBean) {
		this.nomeBean = nomeBean;
	}

	public String getSenhaBean() {
		return senhaBean;
	}

	public void setSenhaBean(String senhaBean) {
		this.senhaBean = senhaBean;
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

//	public boolean Logar() {
//		
}
