package mainAPP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainAPP.dao.IArticuloDao;
import mainAPP.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDao iArticuloDao;

	@Override
	public List<Articulo> listarArticulo() {
		return iArticuloDao.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public Articulo articuloXID(Long codigo) {
		return iArticuloDao.findById(codigo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDao.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long codigo) {
		iArticuloDao.deleteById(codigo);
	}
	
	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		return iArticuloDao.findByNombre(nombre);
	}
}
