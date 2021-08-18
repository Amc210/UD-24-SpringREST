package App.service;

import java.util.List;

import App.dto.Trabajador;

public interface ITrabajadorService {

	public List<Trabajador> listaTrabajador();

	public Trabajador insertTrabajador(Trabajador trabajador);

	public Trabajador trabajadorID(Long id);

	public Trabajador updateTrabajador(Trabajador trabajador);

	public void deleteTrabajador(Long id);
}
