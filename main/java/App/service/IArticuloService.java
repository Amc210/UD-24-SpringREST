package App.service;

import java.util.List;

import App.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listaArticulo();

	public Articulo insertArticulo(Articulo Articulo);

	public Articulo ArticuloID(Long id);
	
	//public Articulo ArticuloName(String name);

	public Articulo updateArticulo(Articulo Articulo);

	public void deleteArticulo(Long id);
}
