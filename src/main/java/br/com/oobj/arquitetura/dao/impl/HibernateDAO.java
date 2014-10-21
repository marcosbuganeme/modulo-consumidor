package br.com.oobj.arquitetura.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.oobj.arquitetura.dao.DAO;
import br.com.oobj.arquitetura.exception.NegocioException;
import br.com.oobj.arquitetura.model.Entidade;

/**
 * <p>
 * <b>Título:</b> HibernateDAO.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por implementar a interface DAO e prover funções de auxilio na consulta de dados.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 * 
 * @param <E>
 *            - Entidade que será manipulada pela classe concreta.
 *
 * @version 1.0.0
 */
@SuppressWarnings("unchecked")
public class HibernateDAO<E extends Entidade> implements DAO<E> {

	/** Atributo manager. */
	private EntityManager manager;

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.dao.DAO#obter(java.io.Serializable)
	 */
	@Override
	public E obter(final Serializable identificador) {

		final Class<E> entidadePesquisada = this.obterTipoEntidade();

		return this.getManager().find(entidadePesquisada, identificador);
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.dao.DAO#salvar(br.com.oobj.arquitetura.model.Entidade)
	 */
	@Override
	public void salvar(final E entidade) throws NegocioException {

		this.getManager().persist(entidade);
	}

	/**
	 * Descrição Padrão: <br>
	 * <br>
	 *
	 * {@inheritDoc}
	 *
	 * @see br.com.oobj.arquitetura.dao.DAO#listar()
	 */
	@Override
	public Collection<E> listar() {

		final Criteria criteria = this.novoCriteria();

		return criteria.list();
	}

	/**
	 * Método responsável por obter um criteria apartir de uma classe generica.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>criteria apartir da entidade manipulada</i>.
	 */
	protected Criteria novoCriteria() {

		final Class<E> classeObtida = this.obterTipoEntidade();

		return this.getSession().createCriteria(classeObtida);
	}

	/**
	 * Método responsável por obter o tipo da entidade através de generics.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>tipo da entidade</i>.
	 */
	private Class<E> obterTipoEntidade() {

		final Type[] tipoEntidade = ( (ParameterizedType) this.getClass().getGenericSuperclass() ).getActualTypeArguments();

		return (Class<E>) tipoEntidade[0];
	}

	/**
	 * Retorna o valor do atributo <code>manager</code>
	 *
	 * @return <code>EntityManager</code>
	 */
	protected EntityManager getManager() {

		return this.manager;
	}

	/**
	 * Retorna o valor da classe <code>Session</code>
	 *
	 * @return <code>Session</code>
	 */
	protected Session getSession() {

		return this.getManager().unwrap(Session.class);
	}

}
