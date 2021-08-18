package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.FabricanteDAO;
import App.dto.Fabricante;

@Service
public class FabricanterService implements IFabricanteService {
	@Autowired
	FabricanteDAO FabricanteDAO;

	@Override
	public Fabricante insertFabricante(Fabricante fabricante) {

		return FabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante FabricanteID(Long id) {
		return FabricanteDAO.findById(id).get();
	}
	
//	@Override
//	public List<Fabricante> FabricanteName(String name) {
//		return FabricanteDAO.findByNombre;
//	}

	@Override
	public List<App.dto.Fabricante> listaFabricante() {
		return FabricanteDAO.findAll();
	}

	@Override
	public App.dto.Fabricante updateFabricante(App.dto.Fabricante fabricante) {
		return FabricanteDAO.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long id) {
		FabricanteDAO.deleteById(id);
	}

}
