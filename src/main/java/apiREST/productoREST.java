package apiREST;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.RequestMapping;

import dbo.Producto;

public class productoREST {
	@PersistenceContext
    private EntityManager entityManager;
	
	@RequestMapping("cliente")
	public Producto getByIdProducto(Long idProducto) {
		return entityManager.find(Producto.class, idProducto);
	}
}
