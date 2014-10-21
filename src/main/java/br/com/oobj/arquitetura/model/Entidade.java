package br.com.oobj.arquitetura.model;

import java.io.Serializable;

/**
 * <p>
 * <b>Título:</b> Entidade.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Interface pai de todas as entidades.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
public interface Entidade extends Serializable {

	/**
	 * Método responsável por obter o identificador de uma entidade.
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>identificador da entidade</i>
	 */
	Serializable getIdentificador();

	/**
	 * Método responsável por verificar através do identificador da entidade, se um registro é ou não novo. <br>
	 * Verificação por identificador. {True, é novo porquê não possui identificador}
	 *
	 * @author marcosbuganeme
	 *
	 * @return <i>True, se o registro for novo</i>.
	 */
	boolean isNovoRegistro();
}
