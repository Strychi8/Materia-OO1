package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Producto> lstGondola = new ArrayList<Producto>();
	private List<Cliente> lstCliente = new ArrayList<Cliente>();
	private List<Carrito> lstCarrito = new ArrayList<Carrito>();
    
	public Supermercado(List<Producto> gondola, List<Cliente> cliente, List<Carrito> carrito) {
		this.lstGondola = gondola;
		this.lstCliente = cliente;
		this.lstCarrito = carrito;
	}
   
	public List<Cliente> getCliente() {
		return lstCliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.lstCliente = cliente;
	}

	public List<Carrito> getCarrito() {
		return lstCarrito;
	}

	public void setCarrito(List<Carrito> carrito) {
		this.lstCarrito = carrito;
	}

	public List<Producto> getGondola() {
		return lstGondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.lstGondola = gondola;
	}
	
	@Override
	public String toString() {
		return "Supermercado [lstGondola=" + lstGondola + ", lstCliente=" + lstCliente + ", lstCarrito=" + lstCarrito
				+ "]";
	}

	public boolean agregarProducto(String producto,float precio) throws Exception {
		int proxId = 1;
		if(lstGondola.size() > 0) {
			proxId = lstGondola.get(lstGondola.size()-1).getIdProducto()+1;
			if(lstGondola.get(lstGondola.size()-1).getProducto().equalsIgnoreCase(producto)) {
				throw new Exception("Error: Ese producto existe");
			}
		}
		return lstGondola.add(new Producto(proxId,producto,precio));
	}
	
	public Producto traerProducto(int idProducto) {
	      int indice=0;
	      Producto product = null;
	      while(product == null && indice<lstGondola.size()) {
	    	  if(lstGondola.get(indice).getIdProducto() == idProducto) {
	    		  product = lstGondola.get(indice);
	    	  }
	    	  indice++;
	      }
		
		return product;
	}
	
	public boolean modificarProducto(int idProducto,String producto,double precio) throws Exception {
        Producto product = traerProducto(idProducto);
        if(product == null) {
        	throw new Exception("Error: Ese producto no existe");
        }
       
       product.setProducto(producto);
       product.setPrecio((float)precio);
       return true;
        
	}
	public boolean eliminarProducto(int idProducto) throws Exception {
		Producto product = traerProducto(idProducto);
		if(product == null) {
			throw new Exception("Error: Ese producto no existe");
		}
		int indice = 0;
		while(indice<lstGondola.size()) {
			if(lstGondola.get(indice).getIdProducto() == idProducto) {
				product = lstGondola.get(indice);
			}
			indice++;
		}
		return lstGondola.remove(product);
	}
	
	public boolean agregarCliente(String cliente,long dni,String direccion) throws Exception {
		int proxId = 1;
		if(lstCliente.size() > 0) {
			proxId = lstCliente.get(lstCliente.size()-1).getIdCliente()+1;
			if(lstCliente.get(lstCliente.size()-1).getDni() == dni) {
				throw new Exception("Error: El cliente ya esta existe en el sistema");
			}
		}
		return lstCliente.add(new Cliente(proxId, cliente,dni,direccion));
	}
	
	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		int indice = 0;
		while(cliente == null && indice<lstCliente.size()) {
			  if(lstCliente.get(indice).getIdCliente() == idCliente) {
				  cliente = lstCliente.get(indice);
			  }
			indice++;
		}
		return cliente;
	}
	
	public boolean eliminarCliente(int idCliente) throws Exception {
		Cliente cliente = traerCliente(idCliente);
		if(cliente == null) {
			throw new Exception("Error: El cliente no existe en el sistema");
		}
		int indice = 0;
		while(indice<lstCliente.size()) {
			if(lstCliente.get(indice).getIdCliente() == idCliente) {
				cliente = lstCliente.get(indice);
			}
			indice++;
		}
		return lstCliente.remove(cliente);
	}
	
	public Carrito traerCarrito(int idCarrito) {
		Carrito carrito = null;
		int indice = 0;
		while(carrito == null && indice<lstCarrito.size()) {
			  if(lstCarrito.get(indice).getIdCarrito() == idCarrito) {
				  carrito = lstCarrito.get(indice);
			  }
			indice++;
		}
		return carrito;
	}
	
	public boolean agregarCarrito(LocalDate fecha,LocalTime hora,Cliente cliente) throws Exception {
		int proxId = 1;
		if(lstCarrito.size() > 0) {
			proxId = lstCarrito.get(lstCarrito.size()-1).getIdCarrito() + 1;
			if(lstCarrito.get(lstCarrito.size()-1).getCliente().equals(cliente)) {
				throw new Exception("Error: El carrito ya esta en el sistema");
			}
		}
		return lstCarrito.add(new Carrito(proxId, fecha,hora, cliente));
	}
	
	public boolean eliminarCarrito(int idCarrito) throws Exception {
		Carrito carrito = traerCarrito(idCarrito);
		if(carrito == null) {
			throw new Exception("Error: El carrito no existe en el sistema");
		}
		int indice = 0;
		while(indice<lstCarrito.size()) {
			if(lstCarrito.get(indice).getIdCarrito() == idCarrito) {
				carrito = lstCarrito.get(indice);
			}
			indice++;
		}
		return lstCarrito.remove(carrito);
	}

}
