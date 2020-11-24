package interfaces;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import dbo.DetalleVenta;

public class interfacesDboImp implements interfacesDbo {

	@PersistenceContext
    private EntityManager entityManager;
 
    @Override
    @Transactional
	public void addAll(List<DetalleVenta> list) {
		for(DetalleVenta detalleVenta : list)
        {
            entityManager.persist(detalleVenta);
        }   		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DetalleVenta> getAll() {
		Query query = entityManager.createQuery("from " + DetalleVenta.class.getName());
        return query.getResultList();
	}

	@Override
	public DetalleVenta getById(Long id) {
		return entityManager.find(DetalleVenta.class, id);
	}

	@Override
	public void deleteAll() {
		entityManager.createQuery("DELETE FROM DetalleVenta").executeUpdate();    
		
	}
	
	

}
