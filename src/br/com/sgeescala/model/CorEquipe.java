package br.com.sgeescala.model;

public enum CorEquipe {

	ROSA(0,"Rosa"),
	LILAS(1,"Lilas"),
	LARANJA(2,"Laranja"),
	VERMELHO(3, "Vermelho"),
	VERDE(4,"Verde"),
	AZUL(5,"Azul"),
	AMARELO(6,"Amarelo"),
	PRETO(7,"Preto");
	
	private Integer valor;
	private String nome;
	
	private CorEquipe(Integer valor, String nome) {
		this.valor = valor;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
}
