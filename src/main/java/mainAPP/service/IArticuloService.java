package mainAPP.service;

import java.util.List;

import mainAPP.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listarArticulo(); //Listar All 
	
	public Articulo guardarArticulo(Articulo articulo);	//Guarda un articulo CREATE
	
	public Articulo articuloXID(Long codigo); //Leer datos de un articulo READ
	
	public List<Articulo> listarArticuloNombre(String nombre);//Listar articulos por campo nombre
	
	public Articulo actualizarArticulo(Articulo articulo); //Actualiza datos del articulo UPDATE
	
	public void eliminarArticulo(Long codigo);// Elimina el articulo DELETE
}
