package br.com.oobj.arquitetura.exception;

/**
 * <p>
 * <b>Título:</b> RegistroNaoExisteException.java
 * </p>
 *
 * <p>
 * <b>Descrição:</b> Classe responsável por representar exceções de registros não existentes.
 * </p>
 *
 * Data de criação: 21/10/2014
 *
 * @author marcosbuganeme
 *
 * @version 1.0.0
 */
public class RegistroNaoExisteException extends NegocioException {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 5001281655877335739L;

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 */
	public RegistroNaoExisteException() {

		super();
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 */
	public RegistroNaoExisteException( final String mensagem ) {

		super(mensagem);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param causa
	 */
	public RegistroNaoExisteException( final Throwable causa ) {

		super(causa);
	}

	/**
	 * Responsável pela criação de novas instâncias desta classe.
	 * 
	 * @param mensagem
	 * 
	 * @param causa
	 */
	public RegistroNaoExisteException( final String mensagem, final Throwable causa ) {

		super(mensagem, causa);
	}

}
