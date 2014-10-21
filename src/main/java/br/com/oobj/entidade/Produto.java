package br.com.oobj.entidade;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.oobj.arquitetura.model.EntidadeAbstrata;

/**
 * <p>
 * <b>Título:</b> Produto.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por representar o produto no sistema.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@Entity
@Table(name = "produto")
public class Produto extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1501683661607186124L;

	/** Atributo colecaoItensPedido. */
	@OneToMany(mappedBy = "produto")
	private Collection<ItemPedido> colecaoItensPedido;

	/** Atributo nome. */
	@NotEmpty
	@Column(name = "nome", nullable = false)
	private String nome;

	/** Atributo valorUnitario. */
	@NotNull
	@Column(name = "valor_unitario", nullable = false)
	private BigDecimal valorUnitario;

	/** Atributo quantidade. */
	@NotNull
	@Column(name = "quantidade", nullable = false)
	private int quantidade;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public Produto() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param nome
	 * 
	 * @param valorUnitario
	 * 
	 * @param quantidade
	 */
	public Produto( final String nome, final BigDecimal valorUnitario, final int quantidade ) {

		this.nome = nome;

		this.valorUnitario = valorUnitario;

		this.quantidade = quantidade;
	}

	/**
	 * Retorna o valor do atributo <code>colecaoItensPedido</code>
	 *
	 * @return <code>Collection<ItemPedido></code>
	 */
	public Collection<ItemPedido> getColecaoItensPedido() {

		return this.colecaoItensPedido;
	}

	/**
	 * Define o valor do atributo <code>colecaoItensPedido</code>.
	 *
	 * @param colecaoItensPedido
	 */
	public void setColecaoItensPedido(final Collection<ItemPedido> colecaoItensPedido) {

		this.colecaoItensPedido = colecaoItensPedido;
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
	 * Retorna o valor do atributo <code>valorUnitario</code>
	 *
	 * @return <code>BigDecimal</code>
	 */
	public BigDecimal getValorUnitario() {

		return this.valorUnitario;
	}

	/**
	 * Define o valor do atributo <code>valorUnitario</code>.
	 *
	 * @param valorUnitario
	 */
	public void setValorUnitario(final BigDecimal valorUnitario) {

		this.valorUnitario = valorUnitario;
	}

	/**
	 * Retorna o valor do atributo <code>quantidade</code>
	 *
	 * @return <code>int</code>
	 */
	public int getQuantidade() {

		return this.quantidade;
	}

	/**
	 * Define o valor do atributo <code>quantidade</code>.
	 *
	 * @param quantidade
	 */
	public void setQuantidade(final int quantidade) {

		this.quantidade = quantidade;
	}

}
