package test;
import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

import dbo.DetalleVenta;


public class productoTest {
	@Autowired
    private DetalleVenta detalleVenta;
 
    @Before(value = "")
    @Transactional
    public void setUp() throws Exception
    {
        // empty repository
 
        List<DetalleVenta> detalleVenta = new LinkedList<DetalleVenta>();
        detalleVenta.add(new DetalleVenta(Long.parseLong("1"),Long.parseLong("2"), Long.parseLong("3")));
 
        detalleVenta.addAll(detalleVenta);
    }
 
    
}
