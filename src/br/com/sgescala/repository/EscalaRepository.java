package br.com.sgescala.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sgescala.model.Escala;
import br.com.sgescala.model.TurmaVoluntario;
import br.unitins.frame.repository.Repository;

public class EscalaRepository extends Repository<Escala> {

	public EscalaRepository(EntityManager em) {
		super(em);
	}
	@Override
	protected Class<Escala> getModelClass() {
		return Escala.class;
	}
	
	@SuppressWarnings("uncheckd")
	public List<Escala> buscarTodosV() {
		
		Query query = geEntityManager().createQuery("Select e From Escala e Order by e.voluntario.pessoa.nome Desc");
		List<Escala> lista = query.getResultList();

		if (lista == null)
			lista = new ArrayList<Escala>();

		return lista;

	}
	@SuppressWarnings("uncheckd")
	public List<Escala> buscarTodos() {
		
		Query query = geEntityManager().createQuery("Select e From Escala e Order by e.id Desc");
		List<Escala> lista = query.getResultList();

		if (lista == null)
			lista = new ArrayList<Escala>();

		return lista;

	}
}
