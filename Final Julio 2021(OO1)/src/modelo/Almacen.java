package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Almacen extends Stock {
	private int unidadesDeseable;
	private int unidadesMinima;
	private List<Lote> lotes;

	public Almacen(int idStock, Producto producto, int unidadesDeseable, int unidadesMinima) {
		super(idStock, producto);
		this.unidadesDeseable = unidadesDeseable;
		this.unidadesMinima = unidadesMinima;
		this.lotes = new ArrayList<Lote>();
	}

	public int getUnidadesDeseable() {
		return unidadesDeseable;
	}

	public void setUnidadesDeseable(int unidadesDeseable) {
		this.unidadesDeseable = unidadesDeseable;
	}

	public int getUnidadesMinima() {
		return unidadesMinima;
	}

	public void setUnidadesMinima(int unidadesMinima) {
		this.unidadesMinima = unidadesMinima;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	@Override
	public String toString() {
		return "Almacen [" + super.toString()  + ", unidadesDeseable=" + unidadesDeseable + ", unidadesMinima=" + unidadesMinima + ", lotes="
				+ lotes + "]";
	}
	
	public boolean agregarLote(LocalDate fecha, int cantInicial, int cantExistente) {
		return lotes.add(new Lote(fecha,cantInicial,cantExistente));
	}

	

}
