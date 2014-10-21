package br.com.oobj.arquitetura.service;

import java.io.Serializable;
import java.util.Collection;

import br.com.oobj.arquitetura.exception.NegocioException;
import br.com.oobj.arquitetura.model.Entidade;

/**
 * <p>
 * <b>Título:</b> ServiceFacade.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Interface responsável por conter a assinatura dos métodos de regras de negócio da aplicação.
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
public interface ServiceFacade<E extends Entidade> extends Serializable {

	/**
	 * Método responsável por salvar um objeto.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 *            - objeto que sofrerá a ação.
	 * 
	 * @throws NegocioException
	 */
	void salvar(final E entidade) throws NegocioException;

	/**
	 * Método responsável por remover um objeto.
	 *
	 * @author marcosbuganeme
	 *
	 * @param entidade
	 *            - objeto que soferá a ação.
	 * 
	 * @throws NegocioException
	 */
	void remover(final E entidade) throws NegocioException;

	/**
	 * Método responsável por obter todos os registros vinculados a entidade corrente.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>lista com todos os registros</i>.
	 */
	Collection<E> listar();
}
