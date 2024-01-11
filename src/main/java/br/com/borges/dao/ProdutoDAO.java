package br.com.borges.dao;

import br.com.borges.domain.Persistente;
import br.com.borges.domain.Produto;
import br.com.borges.reflections.anotacao.cadastro.dao.generic.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

	
	
	public ProdutoDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<Produto> getTipoClasse() {
		// TODO Auto-generated method stub
		return Produto.class;
	}

	@Override
	public void atualiarDados(Produto entity, Produto entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

}
