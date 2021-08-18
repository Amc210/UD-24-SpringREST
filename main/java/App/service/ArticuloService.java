package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.ArticuloDAO;
import App.dto.Articulo;

@Service
public class ArticuloService implements IArticuloService {
	@Autowired
	ArticuloDAO ArticuloDAO;

	@Override
	public Articulo insertArticulo(Articulo Articulo) {

		return ArticuloDAO.save(Articulo);
	}

	@Override
	public Articulo ArticuloID(Long id) {
		return ArticuloDAO.findById(id).get();
	}

	@Override
	public List<App.dto.Articulo> listaArticulo() {
		return ArticuloDAO.findAll();
	}

	@Override
	public App.dto.Articulo updateArticulo(App.dto.Articulo Articulo) {
		return ArticuloDAO.save(Articulo);
	}

	@Override
	public void deleteArticulo(Long id) {
		ArticuloDAO.deleteById(id);
	}


}
