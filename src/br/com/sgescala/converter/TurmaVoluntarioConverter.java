package br.com.sgescala.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.sgescala.factory.JPAFactory;
import br.com.sgescala.model.TurmaVoluntario;
import br.com.sgescala.repository.TurmaVoluntarioRepository;
import br.unitins.frame.application.ApplicationException;

@FacesConverter(value = "TurmaVoluntarioConverter", forClass = TurmaVoluntario.class)
public class TurmaVoluntarioConverter implements Converter {
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		TurmaVoluntarioRepository repository = new TurmaVoluntarioRepository(JPAFactory.getEntityManager());
		try {
			TurmaVoluntario t = ((TurmaVoluntario) repository.find(Integer.parseInt(arg2)));
			return t;
		} catch (NumberFormatException | ApplicationException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null) {
			return ((TurmaVoluntario) arg2).getId() == null ? "" : ((TurmaVoluntario) arg2).getId().toString();
		}
		return "";
	}
}
