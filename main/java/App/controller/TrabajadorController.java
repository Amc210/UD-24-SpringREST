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

import App.dto.Trabajador;
import App.dto.Trabajador.Status;
import App.service.TrabajadorService;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	@Autowired
	TrabajadorService trabajadorService;

	@GetMapping("/trabajador")
	public List<Trabajador> listatrabajador() {
		return trabajadorService.listaTrabajador();
	}

	@PostMapping("/trabajador")
	public Trabajador insertTrabajador(@RequestBody Trabajador trabajador) {
		return trabajadorService.insertTrabajador(trabajador);
	}

	@GetMapping("/trabajador/{id}")
	public Trabajador trabajadorID(@PathVariable(name = "id") Long id) {
		Trabajador trabajador_id = new Trabajador();
		trabajador_id = trabajadorService.trabajadorID(id);
		System.out.println("Trabajador ID: " + trabajador_id);
		return trabajador_id;
	}
	
	//No he conseguido que muestre el trabajo
	@GetMapping("/trabajador/{trabajo}")
	public Status trabajadorTrabajo(@PathVariable(name = "trabajo") String trabajo, @RequestBody Trabajador trabajador) {
		System.out.println(trabajador.getTrabajo());
		return trabajador.getTrabajo();
	}

	@PutMapping("/trabajador/{id}")
	public Trabajador updateTrabajador(@PathVariable(name = "id") Long id, @RequestBody Trabajador trabajador) {
		Trabajador trabajadorSelected = new Trabajador();
		Trabajador trabajadorUpdated = new Trabajador();

		trabajadorSelected = trabajadorService.trabajadorID(id);
		trabajadorSelected.setNombre(trabajador.getNombre());
		trabajadorSelected.setTrabajo(trabajador.getTrabajo());

		trabajadorSelected = trabajadorService.updateTrabajador(trabajadorSelected);

		System.out.println("Trabajador actualizado");

		return trabajadorUpdated;
	}

	@DeleteMapping("/trabajador/{id}")
	public void deleteTrabajador(@PathVariable(name = "id") Long id) {
		trabajadorService.deleteTrabajador(id);
	}
}
