package dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProducto")
	private Long idProducto;
	
	@Column(name = "nombre", nullable = false, unique=true)
	private String nombre;
	
	@Column(name = "precio", nullable = false, unique=true)
	private float precio;
	
	public Producto(Long _idProducto, String _nombre, float _precio) {
		this.idProducto = _idProducto;
		this.nombre = _nombre;
		this.precio = _precio;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
