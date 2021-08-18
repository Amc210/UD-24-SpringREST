package App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.dto.Articulo;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	@Autowired
	App.service.ArticuloService ArticuloService;

	@GetMapping("/articulo")
	public List<Articulo> listaArticulo() {
		return ArticuloService.listaArticulo();
	}

	@PostMapping("/articulo")
	public Articulo insertArticulo(@RequestBody Articulo articulo) {
		return ArticuloService.insertArticulo(articulo);
	}

	@GetMapping("/articulo/{id}")
	public Articulo ArticuloID(@PathVariable(name = "id") Long id) {
		Articulo articulo_id = new Articulo();
		articulo_id = ArticuloService.ArticuloID(id);
		System.out.println("Articulo ID: " + articulo_id);
		return articulo_id;
	}
	
//	@GetMapping("/articulo/{name}")
//	public Articulo ArticuloName(@PathVariable(name = "name") String name) {
//		Articulo articulo_name = new Articulo();
//		articulo_name = ArticuloService.ArticuloName(name);
//		System.out.println("Articulo name: " + articulo_name);
//		
//		return articulo_name;		
//	}

	@PutMapping("/articulo/{id}")
	public Articulo updateArticulo(@PathVariable(name = "id") Long id, @RequestBody Articulo Articulo) {
		Articulo ArticuloSelected = new Articulo();
		Articulo ArticuloUpdated = new Articulo();

		ArticuloSelected = ArticuloService.ArticuloID(id);
		ArticuloSelected.setNombre(Articulo.getNombre());
		ArticuloSelected.setPrecio(Articulo.getPrecio());
		ArticuloSelected.setFabricante(Articulo.getFabricante());

		ArticuloSelected = ArticuloService.updateArticulo(ArticuloSelected);

		System.out.println("Articulo actualizado");

		return ArticuloUpdated;
	}

	@DeleteMapping("/articulo/{id}")
	public void deleteArticulo(@PathVariable(name = "id") Long id) {
		ArticuloService.deleteArticulo(id);
	}
}
