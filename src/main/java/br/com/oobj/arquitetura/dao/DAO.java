package br.com.oobj.arquitetura.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.oobj.arquitetura.exception.NegocioException;
import br.com.oobj.arquitetura.model.Entidade;

/**
 * <p>
 * <b>Título:</b> DAO.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Interface pai de todos os DAO's.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
public interface DAO<E extends Entidade> {

	/**
	 * Método responsável por obter uma entidade através de seu identificador.
	 *
	 * @author marcosbuganeme
	 *
	 * @param identificador
	 *            - id do registro.
	 * 
	 * @return <i>entidade pesquisada</i>.
	 */
	E obter(final Serializable identificador);

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
	 * Método responsável por obter todos os registros vinculados a entidade corrente.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>lista com todos os registros</i>.
	 */
	Collection<E> listar();
}
