package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Pedido> pedidos;

	public Sistema() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Sistema [pedidos=" + pedidos + "]";
	}
    //+ agregarPedidoPapelMensual(LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega, int
	//cantidadResmas) : boolean //lanza una excepción en caso de que la cantidad de resmas sea 0
	public boolean agregarPedidoPapelMensual(LocalDate fechaCreacion,double montoBase,LocalDate fechaEntrega,int cantidadResmas) throws Exception{
		
		int proxId = 1;
		if(pedidos.size() > 0) {
			proxId = pedidos.get(pedidos.size()-1).getIdPedido()+1;
		}
		return pedidos.add(new PedidoPapelMensual(proxId,fechaCreacion,montoBase,fechaEntrega,cantidadResmas));
	}
	//+ agregarPedidoElectronico(LocalDate fechaCreacion, double montoBase, String motivo, double
	//porcentajeExtra) : boolean //lanza una excepción en caso de que el motivo sea un String vacío
    public boolean agregarPedidoElectronico(LocalDate fechaCreacion,double montoBase,String motivo,double porcentajeExtra) throws Exception {
    	
    	int proxId = 1;
    	if(pedidos.size() > 0) {
    		proxId = pedidos.get(pedidos.size()-1).getIdPedido() + 1;
  
    	}
    	return pedidos.add(new PedidoElectronico(proxId,fechaCreacion,montoBase,motivo,porcentajeExtra));
    }
    public Pedido traerPedido(int idPedido) {
    	Pedido pedido = null;
    	int indice = 0;
    	
    	while(pedido==null && indice<pedidos.size()) {
    		if(pedidos.get(indice).getIdPedido() == idPedido) {
    			pedido = pedidos.get(indice);
    		}
    		indice++;
    	}
    	return pedido;
    }
    
    public double calcularTotalGeneral() {
		double total = 0;
		for(int indice=0; indice<pedidos.size(); indice++) {
			total = total + pedidos.get(indice).getMontoBase(); 
		}
		return total;
	}
     public List<Pedido> traerPedido(String motivo){
    	List<Pedido> listaPedidos = new ArrayList<Pedido>();
    
    	for(int indice=0; indice<pedidos.size(); indice++) {
    		if(pedidos.get(indice) instanceof PedidoElectronico) {
    			PedidoElectronico pedido = (PedidoElectronico) pedidos.get(indice);
    			if(pedido.getMotivo().equalsIgnoreCase(motivo)) {
    				listaPedidos.add(pedido);
    			}
    		}
    	}
    	return listaPedidos;
     }
	
}
