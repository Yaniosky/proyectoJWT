package apiREST;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.RequestMapping;

import dbo.Venta;

public class ventaREST {
	@PersistenceContext
    private EntityManager entityManager;
	
	@RequestMapping("cliente")
	public Venta getByIdVenta(Long idVenta) {
		return entityManager.find(Venta.class, idVenta);
	}
}
