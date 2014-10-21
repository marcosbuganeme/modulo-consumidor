package br.com.oobj.arquitetura.service.impl;

import java.util.Collection;

import br.com.oobj.arquitetura.dao.DAO;
import br.com.oobj.arquitetura.exception.NegocioException;
import br.com.oobj.arquitetura.model.Entidade;
import br.com.oobj.arquitetura.service.ServiceFacade;

/**
 * <p>
 * <b>Título:</b> Service.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por conter a implementação de algumas funções pré definidas e por conter regras de negócio.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 * 
 * @param <E>
 *            - Entidade manipulada pela classe concreta.
 *
 * @version 1.0.0
 */
public abstract class Service<E extends Entidade> implements ServiceFacade<E> {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 4215988429225017096L;

	/** Constante CAMPOS_NULOS. */
	private static final String CAMPOS_OBRIGATORIOS_NULOS = "validacao.camposobrigatorios";

	/** Atributo dao. */
	private DAO<E> dao;

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.service.ServiceFacade#salvar(br.com.oobj.arquitetura.model.Entidade)
	 */
	@Override
	public void salvar(final E entidade) throws NegocioException {

		if (entidade == null) {

			throw new NegocioException(Service.CAMPOS_OBRIGATORIOS_NULOS);
		}

		this.getDao().salvar(entidade);
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.service.ServiceFacade#listar()
	 */
	@Override
	public Collection<E> listar() {

		return this.getDao().listar();
	}

	/**
	 * Retorna o valor do atributo <code>dao</code>
	 *
	 * @return <code>DAO<E></code>
	 */
	protected DAO<E> getDao() {

		return this.dao;
	}

}
