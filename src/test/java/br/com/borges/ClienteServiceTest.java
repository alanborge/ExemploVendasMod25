package br.com.borges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.borges.dao.ClienteDaoMock;
import br.com.borges.dao.IClienteDAO;
import br.com.borges.domain.Cliente;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;
import br.com.borges.services.ClienteService;
import br.com.borges.services.IClienteService;

public class ClienteServiceTest {

	private IClienteService clienteService;
	private Cliente cliente;

	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}

	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678910L);
		cliente.setNome("Alan");
		cliente.setCidade("Goiania");
		cliente.setEnd("End");
		cliente.setEstado("GO");
		cliente.setNumero(10);
		cliente.setTel(993305853L);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		System.out.println("Cliente consultado: " + clienteConsultado);
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException{
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Alan Borges");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Alan Borges", cliente.getNome());
	}

}
