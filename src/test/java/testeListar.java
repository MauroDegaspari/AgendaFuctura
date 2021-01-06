import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.UsuarioDaoImplements;
import entidade.Usuario;
import util.JpaUtil;

public class testeListar {

	public static void main(String[] args) {
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		
		Usuario u = new UsuarioDaoImplements().pesquisarLogin("catarina"); 
		
		System.out.println(u.getNome());
		
		
		
	}

}
