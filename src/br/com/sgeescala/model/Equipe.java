package br.com.sgeescala.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import br.unitins.frame.model.Model;

@Entity
public class Equipe extends Model<Equipe>{

	private static final long serialVersionUID = 6855011554434601547L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqidequipe")
	@SequenceGenerator(name = "seqidequipe", sequenceName = "seqidequipe", allocationSize = 1)
	private Integer id;
	
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

}
