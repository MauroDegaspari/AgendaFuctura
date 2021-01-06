package entidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name="Usuario")
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@Column(name="ID_USUARIO", nullable = false)
	@GeneratedValue(generator = "S_USUARIO")
	@SequenceGenerator(name="S_USUARIO", sequenceName = "S_USUARIO", allocationSize = 1)
	private int idusuario;
	
	@Column(name="NOME", nullable = false)
	private String nome;
	
	@Column(name="SENHA", nullable = false)
	private String senha;
	
	@OneToOne
	@JoinColumn(name = "CPF_CLIENTE", referencedColumnName = "CPF")
	private Cliente cliente;
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
