package br.com.oobj.entidade;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

	/** Atributo colecaoCliente. */
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_cliente")
	private Collection<Cliente> colecaoClientes;

	/** Atributo quantidade. */
	@Column(name = "quantidade")
	private int quantidade;

	/** Atributo valor. */
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
	 * @param colecaoClientes
	 * 
	 * @param quantidade
	 * 
	 * @param valor
	 */
	public Pedido( final Collection<Cliente> colecaoClientes, final int quantidade, final BigDecimal valor ) {

		this.colecaoClientes = colecaoClientes;

		this.quantidade = quantidade;

		this.valor = valor;
	}

}
