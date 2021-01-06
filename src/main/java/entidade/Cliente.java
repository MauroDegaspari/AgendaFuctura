package entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Cliente")
@Table(name = "Cliente")
public class Cliente {

	@Id	
	@Column(name="CPF", nullable = false)
	private String cpf;
	
	@Column(name="NOME", nullable=false)
	private String nome;
	
	@Column(name="IDADE", nullable=false)
	private int idade;
	
	@Column(name="SEXO", nullable=false)
	private String sexo;
	
	@Column(name="INTERESSES", nullable=false)
	private String interesses;
	
	@Column(name="LISTACONTATO")
	private String listaContato;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_CONTATO", referencedColumnName = "ID_CONTATO")
	private Contato contato;



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	public String getListaContato() {
		return listaContato;
	}

	public void setListaContato(String listaContato) {
		this.listaContato = listaContato;
	}

	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
