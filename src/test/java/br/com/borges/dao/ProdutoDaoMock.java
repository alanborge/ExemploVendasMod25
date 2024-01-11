package br.com.borges.dao;

import java.util.Collection;

import br.com.borges.domain.Cliente;
import br.com.borges.domain.Produto;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDaoMock implements IProdutoDAO {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto consultar(Long valor) {
		Produto produto = new Produto();
		produto.setCodigo(15315L);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
