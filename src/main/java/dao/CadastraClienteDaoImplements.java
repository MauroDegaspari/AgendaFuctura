package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidade.Cliente;
import entidade.Contato;
import util.JpaUtil;

public class CadastraClienteDaoImplements implements CadastraClienteDao {

	@Override
	public boolean InserirCliente(Cliente cliente, Contato contato) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		
		tx.begin();
		
		ent.merge(cliente);

		tx.commit();
		ent.close();
		return true;
	}

	@Override
	public List<Cliente> PesquisarCliente(Cliente cliente) {
		
		String sql = "from Cliente p where 1=1" + montarWhere(cliente);

		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery(sql);

		List<Cliente> lista = query.getResultList();

		ent.close();

		return lista;
	}

	// String montarWhere
	private String montarWhere(Cliente cliente) {
		String onde = " ";

		if(cliente.getNome() != null && !cliente.getNome().isEmpty()) {
			onde += " and p.nome LIKE '%" + cliente.getNome() + "%'";
		}
		if(cliente.getCpf() != null && !cliente.getCpf().isEmpty()) {
			onde += " and p.cpf = '" + cliente.getCpf() + "'";
		}
			
		return onde;
	}

	

	



}
