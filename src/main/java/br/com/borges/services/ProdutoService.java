package br.com.borges.services;

import br.com.borges.dao.IProdutoDAO;
import br.com.borges.domain.Cliente;
import br.com.borges.domain.Persistente;
import br.com.borges.domain.Produto;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;
import br.com.borges.genericServices.GenericService;

public class ProdutoService extends GenericService<Persistente> implements IProdutoService {

	public IProdutoDAO dao;
	
	public ProdutoService(IProdutoDAO produtoDAO) {
		this.dao = produtoDAO;
	}

	@Override
	public Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Produto buscarPorCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return dao.consultar(codigo);
	}

	@Override
	public void alterar(Produto produto) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Persistente> getTipoClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualiarDados(Persistente entity, Persistente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

	

	
}
