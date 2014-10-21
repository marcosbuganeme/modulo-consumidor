package br.com.oobj.entidade;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.oobj.arquitetura.model.EntidadeAbstrata;

/**
 * <p>
 * <b>Título:</b> Pedido.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por representar o Pedido de um usuário no sistema.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@Entity
@Table(name = "pedido")
public class Pedido extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3436776185784352582L;

	/** Atributo colecaoItensPedido. */
	@OneToMany(mappedBy = "pedido")
	private Collection<ItemPedido> colecaoItensPedido;

	/** Atributo cliente. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_CLIENTE_TABELA_PEDIDO"))
	private Cliente cliente;

	/** Atributo quantidade. */
	@NotNull
	@Column(name = "quantidade")
	private int quantidade;

	/** Atributo valor. */
	@NotNull
	@Column(name = "valor")
	private BigDecimal valor;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public Pedido() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param cliente
	 * 
	 * @param quantidade
	 * 
	 * @param valor
	 */
	public Pedido( final Cliente cliente, final int quantidade, final BigDecimal valor ) {

		this.cliente = cliente;

		this.quantidade = quantidade;

		this.valor = valor;
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
	 * Retorna o valor do atributo <code>cliente</code>
	 *
	 * @return <code>Cliente</code>
	 */
	public Cliente getCliente() {

		return this.cliente;
	}

	/**
	 * Define o valor do atributo <code>cliente</code>.
	 *
	 * @param cliente
	 */
	public void setCliente(final Cliente cliente) {

		this.cliente = cliente;
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

	/**
	 * Retorna o valor do atributo <code>valor</code>
	 *
	 * @return <code>BigDecimal</code>
	 */
	public BigDecimal getValor() {

		return this.valor;
	}

	/**
	 * Define o valor do atributo <code>valor</code>.
	 *
	 * @param valor
	 */
	public void setValor(final BigDecimal valor) {

		this.valor = valor;
	}

}
