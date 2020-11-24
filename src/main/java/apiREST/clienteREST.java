package apiREST;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dbo.DetalleVenta;

@RestController
public class clienteREST {
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@RequestMapping("cliente")
	public DetalleVenta getByIdDetalleVenta(Long idDetalleVenta) {
		return entityManager.find(DetalleVenta.class, idDetalleVenta);
	}
}
