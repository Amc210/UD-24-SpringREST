package App.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador {

	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "trabajo")
	@Enumerated(value = EnumType.STRING)
	private Status trabajo;

	// Para que sea una de las opciones
	public enum Status {
		peon, paleta, capataz
	}

	// Constructores
	public Trabajador() {

	}

	public Trabajador(Long id, String nombre, Status trabajo) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
	}

	// Getters setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Status getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Status trabajo) {
		this.trabajo = trabajo;
	}

	// To string
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + "]";
	}

}
