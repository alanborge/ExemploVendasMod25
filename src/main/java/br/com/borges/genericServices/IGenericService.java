package br.com.borges.genericServices;

import java.util.Collection;

import br.com.borges.domain.Persistente;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente> {
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
	public void excluir(Long valor);
	public void alterar(T entity) throws TipoChaveNaoEncontradaException;
	public T consultar(Long valor);
	public Collection<T> buscarTodos();
}
