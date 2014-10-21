package br.com.oobj.entidade;

import java.util.Collection;

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

	/** Atributo colecaoProdutos. */
	@ManyToOne
	@JoinColumn(name = "id_produto", foreignKey = @ForeignKey(name = "FK_PRODUTO_TABLE_ITEM_PEDIDO"))
	private Collection<Produto> colecaoProdutos;

	/** Atributo colecaoPedidos. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_pedido", foreignKey = @ForeignKey(name = "FK_PEDIDO_TABLE_ITEM_PEDIDO"))
	private Collection<Pedido> colecaoPedidos;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public ItemPedido() {

	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param colecaoProdutos
	 * 
	 * @param colecaoPedidos
	 */
	public ItemPedido( final Collection<Produto> colecaoProdutos, final Collection<Pedido> colecaoPedidos ) {

		this.colecaoProdutos = colecaoProdutos;

		this.colecaoPedidos = colecaoPedidos;
	}

	/**
	 * Retorna o valor do atributo <code>colecaoProdutos</code>
	 *
	 * @return <code>Collection<Produto></code>
	 */
	public Collection<Produto> getColecaoProdutos() {

		return this.colecaoProdutos;
	}

	/**
	 * Define o valor do atributo <code>colecaoProdutos</code>.
	 *
	 * @param colecaoProdutos
	 */
	public void setColecaoProdutos(final Collection<Produto> colecaoProdutos) {

		this.colecaoProdutos = colecaoProdutos;
	}

	/**
	 * Retorna o valor do atributo <code>colecaoPedidos</code>
	 *
	 * @return <code>Collection<Pedido></code>
	 */
	public Collection<Pedido> getColecaoPedidos() {

		return this.colecaoPedidos;
	}

	/**
	 * Define o valor do atributo <code>colecaoPedidos</code>.
	 *
	 * @param colecaoPedidos
	 */
	public void setColecaoPedidos(final Collection<Pedido> colecaoPedidos) {

		this.colecaoPedidos = colecaoPedidos;
	}

}
