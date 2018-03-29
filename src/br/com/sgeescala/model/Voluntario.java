package br.com.sgeescala.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;

@Entity
public class Voluntario extends Model<Voluntario>{

	private static final long serialVersionUID = -8471667187890042726L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqidvoluntario")
	@SequenceGenerator(name = "seqidvoluntario", sequenceName = "seqidvoluntario", allocationSize = 1)
	private Integer id;
	
	private String nome;
	private String telefone;
	private String senha;
	
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
