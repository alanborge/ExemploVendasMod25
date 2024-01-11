package br.com.borges.services;

import br.com.borges.domain.Cliente;
import br.com.borges.domain.Produto;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;
import br.com.borges.genericServices.IGenericService;

public interface IProdutoService {
	
	Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException;

	Produto buscarPorCodigo(Long codigo);

	void excluir(Long codigo);

	void alterar(Produto produto)throws TipoChaveNaoEncontradaException;

}
