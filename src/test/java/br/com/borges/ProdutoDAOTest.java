package br.com.borges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.borges.dao.IProdutoDAO;
import br.com.borges.dao.ProdutoDaoMock;
import br.com.borges.domain.Cliente;
import br.com.borges.domain.Produto;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {
	
	private IProdutoDAO produtoDAO;
	
	private Produto produto;
	
	public ProdutoDAOTest() {
		produtoDAO = new ProdutoDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo(15315L);
		produto.setNome("talarica - produto test");
		produto.setDescricao("Descrição do produto");
		produto.setValor(10516.58);
		
		produtoDAO.cadastrar(produto);		
	}
	
	@Test
	public void pesquisarProduto() {
		Produto produtoConsultado = this.produtoDAO.consultar(this.produto.getCodigo());
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void salvarProduto()throws TipoChaveNaoEncontradaException{
		Boolean retorno = produtoDAO.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirProduto() {
		produtoDAO.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarProduto()throws TipoChaveNaoEncontradaException{
		produto.setNome("alterando nome do produto");
		produtoDAO.alterar(produto);
	}

}
