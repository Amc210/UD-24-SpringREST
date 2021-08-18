package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.TrabajadorDAO;
import App.dto.Trabajador;

@Service
public class TrabajadorService implements ITrabajadorService {
	@Autowired
	TrabajadorDAO trabajadorDAO;

	@Override
	public Trabajador insertTrabajador(Trabajador trabajador) {

		return trabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorID(Long id) {
		return trabajadorDAO.findById(id).get();
	}

	@Override
	public List<App.dto.Trabajador> listaTrabajador() {
		return trabajadorDAO.findAll();
	}

	@Override
	public App.dto.Trabajador updateTrabajador(App.dto.Trabajador trabajador) {
		return trabajadorDAO.save(trabajador);
	}

	@Override
	public void deleteTrabajador(Long id) {
		trabajadorDAO.deleteById(id);
	}

}
