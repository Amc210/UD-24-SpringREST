package App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Fabricante;

public interface FabricanteDAO extends JpaRepository<Fabricante, Long> {

}
