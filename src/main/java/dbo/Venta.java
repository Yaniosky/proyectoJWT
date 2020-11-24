package dbo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idVenta")
	private Long idVenta;
	
	@Column(name = "idCliente", nullable = false, unique=true)
	private Long idCliente;
	
	@Column(name = "fecha", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	public Venta(Long _idVenta, Long _idCliente, Date _fecha) {
		this.idVenta=_idVenta;
		this.idCliente=_idCliente;
		this.fecha=_fecha;
	}
	
	public Long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
}
