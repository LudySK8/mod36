package br.com.ltoledo.dao.jpa;

import br.com.ltoledo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.ltoledo.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}