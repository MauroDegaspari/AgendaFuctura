package dao;

import java.util.List;

import entidade.Cliente;
import entidade.Contato;


public interface CadastraClienteDao {

public boolean InserirCliente(Cliente cliente, Contato contato);
	
public List<Cliente> PesquisarCliente(Cliente cliente);


}
