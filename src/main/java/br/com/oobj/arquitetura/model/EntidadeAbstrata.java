package br.com.oobj.arquitetura.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.oobj.arquitetura.enuns.EnumStatus;

/**
 * <p>
 * <b>Título:</b> EntidadeAbstrata.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por implementar a interface <code>Entidade</code> e prover atributos em comuns para as demais entidades.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
@MappedSuperclass
public class EntidadeAbstrata implements Entidade {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 7213925734450997816L;

	/** Atributo identificador. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long identificador;

	/** Atributo status. */
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private EnumStatus status;

	/** Atributo cadastrado. */
	@Temporal(TemporalType.DATE)
	@Column(name = "cadastrado", updatable = false)
	private Date cadastrado;

	@PrePersist
	private void preencheDadosCadastro() {

		this.status = EnumStatus.ATIVO;

		this.cadastrado = new Date();
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.model.Entidade#getIdentificador()
	 */
	@Override
	public Serializable getIdentificador() {

		return this.identificador;
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.model.Entidade#isNovoRegistro()
	 */
	@Override
	public boolean isNovoRegistro() {

		return this.getIdentificador() == null;
	}

	/**
	 * Retorna o valor do atributo <code>status</code>
	 *
	 * @return <code>EnumStatus</code>
	 */
	public EnumStatus getStatus() {

		return this.status;
	}

	/**
	 * Define o valor do atributo <code>status</code>.
	 *
	 * @param status
	 */
	public void setStatus(final EnumStatus status) {

		this.status = status;
	}

	/**
	 * Retorna o valor do atributo <code>cadastrado</code>
	 *
	 * @return <code>Date</code>
	 */
	public Date getCadastrado() {

		return this.cadastrado;
	}

}
