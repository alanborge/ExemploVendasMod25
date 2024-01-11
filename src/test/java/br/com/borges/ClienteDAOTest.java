/**
 * 
 */
package br.com.borges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.borges.dao.ClienteDAO;
import br.com.borges.dao.ClienteDaoMock;
import br.com.borges.dao.IClienteDAO;
import br.com.borges.domain.Cliente;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 */
public class ClienteDAOTest {

	private IClienteDAO clienteDAO;

	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDAO = new ClienteDaoMock();
	}

	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12345678910L);
		cliente.setNome("Alan");
		cliente.setCidade("Goiania");
		cliente.setEnd("End");
		cliente.setEstado("GO");
		cliente.setNumero(10);
		cliente.setTel(993305853L);

		clienteDAO.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Allan Borges");
		clienteDAO.alterar(cliente);
	}
}
