package interfaces;

import java.util.List;

import dbo.*;

public interface interfacesDbo {
	
	void addAll(List<DetalleVenta> list);
    
	List<DetalleVenta> getAll();

	/**
	 * búsqueda por “idVenta” o “idCliente” 
	 * @param id
	 * @return
	 */
	DetalleVenta getById(Long id);
	
	void deleteAll();
}
