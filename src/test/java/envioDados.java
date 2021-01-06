import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import entidade.Contato;
import util.JpaUtil;

public class envioDados {

	public static void main(String[] args) {
		EntityManager ent = JpaUtil.getEntityManager();
		
	//	Usuario usuario = new Usuario();
		Cliente cliente = new Cliente();
		Contato contato = new Contato();
		
	//	usuario.setNome("catarina");
	//	usuario.setSenha("123");
		cliente.setNome(" choque de cutura");
		cliente.setCpf("043212341");
		cliente.setIdade(32);
		cliente.setSexo("masculino");
		cliente.setInteresses("programa");
		contato.setTelefone(33214123);
		contato.setEmail("choque@gmail.com");
		cliente.setContato(contato);
//		
//		usuario.setCliente(cliente);
//		cliente.setContato(contato);

		
		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.merge(cliente);
		tx.commit();
		ent.close();
		
	
		
		
	}

}
