package br.com.oobj.entidade;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.oobj.arquitetura.model.EntidadeAbstrata;

@Entity
@Table(name = "produto")
public class Produto extends EntidadeAbstrata {

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 1501683661607186124L;

}
