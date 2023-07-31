package modelo;

public abstract class Audiovisual {
	protected String codAudiovisual;
	protected String titulo;
	protected int anio;
	protected boolean estreno;
	protected String genero;

	public Audiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero) {
		super();
		this.codAudiovisual = codAudiovisual;
		this.titulo = titulo;
		this.anio = anio;
		this.estreno = estreno;
		this.genero = genero;
	}

	public String getCodAudiovisual() {
		return codAudiovisual;
	}

	public void setCodAudiovisual(String codAudiovisual) {
		/*int suma = 0;
		char [] codAux = codAudiovisual.toCharArray();
		for(int i=0; i<codAudiovisual.length(); i=i+2) {
			suma = suma + Integer.valueOf(Character.toString(codAux[i]));	
		}*/
		
		this.codAudiovisual = codAudiovisual;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEstreno() {
		return estreno;
	}

	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Audiovisual [codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno="
				+ estreno + ", genero=" + genero + "]";
	}
	
	public abstract int calcularDuracion();

}
