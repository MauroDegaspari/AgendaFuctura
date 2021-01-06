package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidade.Usuario;
import util.JpaUtil;

public class UsuarioDaoImplements implements CadastrarUsuarioDao {

	@Override
	public boolean InserirUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();

		tx.begin();

		ent.merge(usuario);

		tx.commit();
		ent.close();
		return true;
	}

	@Override
	public boolean AlterarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean DeletarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Usuario pesquisarLogin(String nome) {
		
		String sql = "FROM Usuario P WHERE P.nome = ?";

		EntityManager ent = JpaUtil.getEntityManager();

		Query query = ent.createQuery(sql);
		query.setParameter(1, nome);

		List<Usuario> lista = query.getResultList();

		ent.close();

		if (lista != null && lista.size() > 0) {
			return lista.get(0);
		} else {
			return null;
		}

	}
	

	
	

}
