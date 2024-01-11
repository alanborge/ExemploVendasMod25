package br.com.borges;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.borges.dao.IProdutoDAO;
import br.com.borges.dao.ProdutoDaoMock;
import br.com.borges.domain.Produto;
import br.com.borges.exceptions.TipoChaveNaoEncontradaException;
import br.com.borges.services.IProdutoService;
import br.com.borges.services.ProdutoService;

public class ProdutoServiceTest {
	
	private IProdutoService produtoService;
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo(15315L);
		produto.setNome("talarica - produto test");
		produto.setDescricao("Descrição do produto");
		produto.setValor(10516.58);
			
	}
	
	@Test
	public void pesquisarProduto() {
		Produto produtoConsultado = produtoService.buscarPorCodigo(produto.getCodigo());
		System.out.println("Produto consultado: " + produtoConsultado);
		Assert.assertNotNull(produtoConsultado);
	}
	
	@Test
	public void salvarProduto()throws TipoChaveNaoEncontradaException{
		Boolean retorno = produtoService.salvar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirProduto() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarProduto()throws TipoChaveNaoEncontradaException{
		produto.setNome("alterando nome do produto");
		produtoService.alterar(produto);
	}

}
