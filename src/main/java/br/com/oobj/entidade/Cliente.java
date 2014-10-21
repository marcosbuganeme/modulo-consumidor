package br.com.oobj.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.oobj.arquitetura.model.EntidadeAbstrata;

/**
 * <p>
 * <b>Título:</b> Cliente.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por representar o Cliente do sistema.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@Entity
@Table(name = "cliente")
public class Cliente extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -4698544215450649822L;

	/** Atributo nome. */
	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private String senha;

	/** Atributo pedido. */
	@OneToMany(mappedBy = "cliente")
	private Pedido pedido;
	
	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public Cliente() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param nome
	 * 
	 * @param email
	 * 
	 * @param senha
	 */
	public Cliente( final String nome, final String email, final String senha ) {

		this.nome = nome;

		this.email = email;

		this.senha = senha;
	}

	/**
	 * Retorna o valor do atributo <code>nome</code>
	 *
	 * @return <code>String</code>
	 */
	public String getNome() {

		return this.nome;
	}

	/**
	 * Define o valor do atributo <code>nome</code>.
	 *
	 * @param nome
	 */
	public void setNome(final String nome) {

		this.nome = nome;
	}

	/**
	 * Retorna o valor do atributo <code>email</code>
	 *
	 * @return <code>String</code>
	 */
	public String getEmail() {

		return this.email;
	}

	/**
	 * Define o valor do atributo <code>email</code>.
	 *
	 * @param email
	 */
	public void setEmail(final String email) {

		this.email = email;
	}

	/**
	 * Retorna o valor do atributo <code>senha</code>
	 *
	 * @return <code>String</code>
	 */
	public String getSenha() {

		return this.senha;
	}

	/**
	 * Define o valor do atributo <code>senha</code>.
	 *
	 * @param senha
	 */
	public void setSenha(final String senha) {

		this.senha = senha;
	}

}
