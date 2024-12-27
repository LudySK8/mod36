package br.com.ltoledo.dao.jpa;

import br.com.ltoledo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.ltoledo.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}