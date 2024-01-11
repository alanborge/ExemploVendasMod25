package br.com.borges.services;

import br.com.borges.dao.ClienteDAO;
import br.com.borges.dao.IClienteDAO;
import br.com.borges.domain.Cliente;
import br.com.borges.domain.Persistente;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;
import br.com.borges.genericServices.GenericService;

public class ClienteService extends GenericService<Persistente> implements IClienteService {
    
	public IClienteDAO dao;
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.dao = clienteDAO;
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		// TODO Auto-generated method stub
		return dao.consultar(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
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
