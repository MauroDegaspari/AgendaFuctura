import javax.persistence.EntityManager;

import util.JpaUtil;

public class conexao {

	public static void main(String[] args) {
		
		EntityManager ent = JpaUtil.getEntityManager();
		System.out.println(ent.isOpen());
	}

}
