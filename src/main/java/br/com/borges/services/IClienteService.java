package br.com.borges.services;

import br.com.borges.domain.Cliente;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente)throws TipoChaveNaoEncontradaException;

}
