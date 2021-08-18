package App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Articulo;

public interface ArticuloDAO extends JpaRepository<Articulo, Long> {
//	public List <Articulo> findByNombre(String nombre);
}
