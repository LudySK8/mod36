package br.com.ltoledo.dao.jpa;

import br.com.ltoledo.dao.generic.jpa.IGenericJapDAO;
import br.com.ltoledo.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}