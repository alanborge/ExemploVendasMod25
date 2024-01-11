package br.com.borges.domain;

import anotacao.TipoChave;

public class Produto implements Persistente {
    
	@TipoChave("getCodigo")
	private Long codigo;
	
	private String nome;
	
	private String descricao;
	
	private Double valor;

	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
