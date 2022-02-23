package mainAPP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainAPP.dao.IFabricanteDao;
import mainAPP.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDao iFabricanteDao;
	
	@Override
	public List<Fabricante> listarFabricante() {
		return iFabricanteDao.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(Long codigo) {
		return iFabricanteDao.findById(codigo).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo) {
		iFabricanteDao.deleteById(codigo);
		
	}
	
	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		return iFabricanteDao.findByNombre(nombre);
	}
}
