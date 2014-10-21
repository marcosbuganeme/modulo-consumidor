package br.com.oobj.entidade;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.oobj.arquitetura.model.EntidadeAbstrata;

/**
 * <p>
 * <b>Título:</b> ItemPedido.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por representar os itens de um pedido do cliente.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@Entity
@Table(name = "item_pedido")
public class ItemPedido extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = -3001278585243190980L;

	/** Atributo produto. */
	@ManyToOne
	@JoinColumn(name = "id_produto", foreignKey = @ForeignKey(name = "FK_PRODUTO_TABELA_ITEM_PEDIDO"))
	private Produto produto;

	/** Atributo pedido. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_pedido", foreignKey = @ForeignKey(name = "FK_PEDIDO_TABELA_ITEM_PEDIDO"))
	private Pedido pedido;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public ItemPedido() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param produto
	 * 
	 * @param pedido
	 */
	public ItemPedido( final Produto produto, final Pedido pedido ) {

		this.produto = produto;

		this.pedido = pedido;
	}

	/**
	 * Retorna o valor do atributo <code>produto</code>
	 *
	 * @return <code>Produto</code>
	 */
	public Produto getProduto() {

		return this.produto;
	}

	/**
	 * Define o valor do atributo <code>produto</code>.
	 *
	 * @param produto
	 */
	public void setProduto(final Produto produto) {

		this.produto = produto;
	}

	/**
	 * Retorna o valor do atributo <code>pedido</code>
	 *
	 * @return <code>Pedido</code>
	 */
	public Pedido getPedido() {

		return this.pedido;
	}

	/**
	 * Define o valor do atributo <code>pedido</code>.
	 *
	 * @param pedido
	 */
	public void setPedido(final Pedido pedido) {

		this.pedido = pedido;
	}

}
