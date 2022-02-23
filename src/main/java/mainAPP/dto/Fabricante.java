package mainAPP.dto;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fabricante")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nombre;

    @OneToMany
    @JoinColumn(name="codigo")
    private List<Articulo> articulo;
    
	// CONSTRUCTORES
	public Fabricante() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 */

	public Fabricante(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// METODO TO STRING
	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
