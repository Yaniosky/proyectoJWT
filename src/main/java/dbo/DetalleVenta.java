package dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalleVenta")
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idDetalleVenta")
	private Long idDetalleVenta;
	
	@Column(name = "idVenta", nullable = false)
	private Long idVenta;
	
	@Column(name = "idProducto", nullable = false)
	private Long idProducto;
	
	public DetalleVenta(Long _idDetalleVenta, Long _idVenta, Long _idProducto) {
		this.idDetalleVenta = _idDetalleVenta;
		this.idVenta = _idVenta;
		this.idProducto = _idProducto;
	}

	public Long getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Long idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
