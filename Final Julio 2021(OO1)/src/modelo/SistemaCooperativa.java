package modelo;

import java.util.ArrayList;
import java.util.List;

public class SistemaCooperativa {
	private List<Stock> stocks;
	private List<Producto> productos;

	public SistemaCooperativa() {
		super();
		this.stocks = new ArrayList<Stock>();
		this.productos = new ArrayList<Producto>();
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "SistemaCooperativa [stocks=" + stocks + ", productos=" + productos + "]";
	}
	
	public boolean agregarProducto(String codigo, String nombre, double precio) throws Exception {
		int proxId = 1;
		if(productos.size()>0) {
			proxId = productos.get(productos.size()-1).getIdProducto()+1;
		}
		return productos.add(new Producto(proxId,codigo,nombre,precio));
	}
	
	public Producto traerProducto(String codigo) {
		Producto producto = null;
		int indice = 0;
		while(producto == null && indice<productos.size()) {
			if(productos.get(indice).getCodigo().equalsIgnoreCase(codigo)) {
				producto = productos.get(indice);
			}
			indice++;
		}
		return producto;
	}
	
	public boolean agregarPedido(Producto producto) {
		int proxId = 1;
		if(stocks.size()>0) {
			proxId = stocks.get(stocks.size()-1).getIdStock()+1;
		}
		return stocks.add(new Pedido(proxId,producto));
	}
	
	public boolean agregarAlmacen(Producto producto, int unidadesDeseable, int unidadesMinima) {
		int proxId = 1;
		if(stocks.size()>0) {
			proxId = stocks.get(stocks.size()-1).getIdStock()+1;
		}
		return stocks.add(new Almacen(proxId,producto,unidadesDeseable,unidadesMinima));
	}
	
	public List<Stock> traerStock(Producto producto){
		List<Stock> auxLista = new ArrayList<Stock>();
		
		for(int indice=0; indice<stocks.size(); indice++) {
			if(stocks.get(indice).getProducto().equals(producto)) {
				auxLista.add(stocks.get(indice));
			}
		}
		
		return auxLista;
	}
	
	public Stock traerStock(int idStock) {
		Stock stock = null;
		int indice = 0;
		while(stock == null && indice<stocks.size()) {
			if(stocks.get(indice).getIdStock() == idStock) {
				stock = stocks.get(indice);
			}
			indice++;
		}
		return stock;
	}

}
