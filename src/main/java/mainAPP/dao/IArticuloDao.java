package mainAPP.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Articulo;

public interface IArticuloDao extends JpaRepository<Articulo, Long> {
	
	public List<Articulo> findByNombre(String nombre);

	
}
