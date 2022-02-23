package mainAPP.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Fabricante;

public interface IFabricanteDao extends JpaRepository<Fabricante, Long> {

	public List<Fabricante> findByNombre(String nombre);
}
