package App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Trabajador;

public interface TrabajadorDAO extends JpaRepository<Trabajador, Long> {

}
