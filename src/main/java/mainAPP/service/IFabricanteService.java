package mainAPP.service;

import java.util.List;
import mainAPP.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listarFabricante(); //Listar All 
	
	public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
	
	public Fabricante fabricanteXID(Long codigo); //Leer datos de un fabricante READ
	
	public List<Fabricante> listarFabricanteNombre(String nombre);//Listar fabricante por campo nombre
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
	
	public void eliminarFabricante(Long codigo);// Elimina el fabricante DELETE
}
