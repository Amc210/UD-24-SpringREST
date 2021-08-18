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

import App.dto.Fabricante;
import App.service.FabricanterService;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	@Autowired
	FabricanterService FabricanteService;

	@GetMapping("/fabricante")
	public List<Fabricante> listaFabricante() {
		return FabricanteService.listaFabricante();
	}

	@PostMapping("/fabricante")
	public Fabricante insertFabricante(@RequestBody Fabricante Fabricante) {
		return FabricanteService.insertFabricante(Fabricante);
	}

	@GetMapping("/fabricante/{id}")
	public Fabricante FabricanteID(@PathVariable(name = "id") Long id) {
		Fabricante Fabricante_id = new Fabricante();
		Fabricante_id = FabricanteService.FabricanteID(id);
		System.out.println("Fabricante ID: " + Fabricante_id);
		return Fabricante_id;
	}

	@PutMapping("/fabricante/{id}")
	public Fabricante updateFabricante(@PathVariable(name = "id") Long id, @RequestBody Fabricante Fabricante) {
		Fabricante FabricanteSelected = new Fabricante();
		Fabricante FabricanteUpdated = new Fabricante();

		FabricanteSelected = FabricanteService.FabricanteID(id);
		FabricanteSelected.setNombre(Fabricante.getNombre());

		FabricanteSelected = FabricanteService.updateFabricante(FabricanteSelected);

		System.out.println("Fabricante actualizado");

		return FabricanteUpdated;
	}

	@DeleteMapping("/fabricante/{id}")
	public void deleteFabricante(@PathVariable(name = "id") Long id) {
		FabricanteService.deleteFabricante(id);
	}
}
