/**
 * 
 */
package br.com.borges.dao;

import br.com.borges.domain.Cliente;
import br.com.borges.reflections.anotacao.cadastro.dao.generic.GenericDAO;

/**
 * 
 */
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

	
	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}


}
