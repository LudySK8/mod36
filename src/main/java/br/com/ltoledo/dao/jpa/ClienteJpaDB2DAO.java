package br.com.ltoledo.dao.jpa;

import br.com.ltoledo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.ltoledo.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}