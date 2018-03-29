package br.com.sgeescala.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.unitins.frame.model.Model;

@Entity
public class Data extends Model<Data>{

	private static final long serialVersionUID = -4773153164646227977L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqiddata")
	@SequenceGenerator(name = "seqiddata", sequenceName = "seqiddata", allocationSize = 1)
	private Integer id;
	

	@Temporal(TemporalType.DATE)
	private Date data;
	private ArrayList<Escala>subEquipe;

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

	public ArrayList getSubEquipe() {
		return subEquipe;
	}

	public void setSubEquipe(ArrayList subEquipe) {
		this.subEquipe = subEquipe;
	}

}
