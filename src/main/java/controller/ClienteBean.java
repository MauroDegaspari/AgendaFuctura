package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.PrimeFaces;

import dao.CadastraClienteDao;
import dao.CadastraClienteDaoImplements;
import entidade.Cliente;
import entidade.Contato;

@ManagedBean(name="CadastraClienteBean")
@SessionScoped
public class ClienteBean {

	private Cliente cliente;
	private Contato contato;
	private CadastraClienteDao dao;
	private List<Cliente> listarCliente;
	
		
	public ClienteBean() {
		this.cliente = new Cliente();
		this.contato = new Contato();
		this.dao = new CadastraClienteDaoImplements();
		this.listarCliente = new ArrayList<Cliente>();
	}
	
	
	public void CadastrarCliente() {
		this.dao.InserirCliente(cliente, contato);
	}
	
	public void PesquisarCliente() {
		this.listarCliente = dao.PesquisarCliente(this.cliente);
	}
	
	public void dialog() {
		Map<String, Object> opcoes = new HashMap<>();
		opcoes.put("modal", true);
		opcoes.put("resizable", false);
		opcoes.put("contentHeight", 470);
		
		
		PrimeFaces.current().dialog().openDynamic("listaContato", opcoes, null);
	}

	//  GETS AND SETS
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Cliente> getListarCliente() {
		return listarCliente;
	}

	public void setListarCliente(List<Cliente> listarCliente) {
		this.listarCliente = listarCliente;
	}

	

	public void setDao(CadastraClienteDaoImplements dao) {
		this.dao = dao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}


	public CadastraClienteDao getDao() {
		return dao;
	}


	public void setDao(CadastraClienteDao dao) {
		this.dao = dao;
	}

	
	
}
