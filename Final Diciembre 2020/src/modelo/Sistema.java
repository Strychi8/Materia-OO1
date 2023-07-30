package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Mensaje> listaMensajes;

	public Sistema() {
		this.listaMensajes = new ArrayList<Mensaje>();
	}

	public List<Mensaje> getListaMensajes() {
		return listaMensajes;
	}

	public void setListaMensajes(List<Mensaje> listaMensajes) {
		this.listaMensajes = listaMensajes;
	}

	@Override
	public String toString() {
		return "Sistema [listaMensajes=" + listaMensajes + "]";
	}
	
    /*+ agregarSMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino,
	String texto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) : boolean //El
	atributo visto se inicializará por defecto en falso.*/
	public boolean agregarSMS(LocalDate fechaEnvio, LocalTime horaEnvio, int numeroOrigen, int numeroDestino,
			String texto, OperadorMovil operadorOrigen, OperadorMovil operadorDestino) throws Exception {
		
		boolean visto = false;
		int proxId = 1;
		if(listaMensajes.size() > 0) {
			proxId = listaMensajes.get(listaMensajes.size()-1).getIdMensaje()+1;
		}
		return listaMensajes.add(new SMS(proxId,fechaEnvio,horaEnvio,numeroOrigen,numeroDestino,texto,visto,operadorOrigen,operadorDestino));
	}
	
	/*+ agregarEmail(LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String
    asunto, String cuerpo) : boolean //El atributo recibido se inicializará por defecto en falso.*/
	public boolean agregarEmail(LocalDate fechaEnvio, LocalTime horaEnvio, String origen, String destino, String
    asunto, String cuerpo) throws Exception {
		
		boolean recibido = false;
		int proxId = 1;
		if(listaMensajes.size() > 0) {
			proxId = listaMensajes.get(listaMensajes.size()-1).getIdMensaje()+1;
		}
		return listaMensajes.add(new Email(proxId,fechaEnvio,horaEnvio,origen,destino,asunto,cuerpo,recibido));
	}
	
	public Mensaje traerMensaje(int idMensaje) {
		Mensaje mensaje = null;
		int indice = 0;
		while(mensaje == null && indice<listaMensajes.size()) {
			if(listaMensajes.get(indice).getIdMensaje() == idMensaje && listaMensajes.get(indice).cambiarDeEstado(true)) {
				mensaje = listaMensajes.get(indice);
			}
			indice++;
		}
		return mensaje;
	}
	
	/*+ traerMensaje(String nombreCompania) : Mensaje //retorna una lista del tipo Mensaje con
     aquellos que tengan como operadorOrigen el nombre de la compañía igual al que ingresa como
     parámetro.*/
    public List<Mensaje> traerMensaje(String companiaMovil){
    	 List<Mensaje> mensajes = new ArrayList<Mensaje>();
     
    	 for(int indice=0; indice<listaMensajes.size(); indice++) {
    		 if(listaMensajes.get(indice) instanceof SMS) {
    			 SMS sms = (SMS) listaMensajes.get(indice);
    			 if(sms.getOperadorOrigen().getCompaniaMovil().equalsIgnoreCase(companiaMovil)) {
    				 mensajes.add(sms);
    			 }
    		 }
    	 }
    	 
    	 return mensajes;
     }
    /* + traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta) : Mensaje //retorna
       una lista del tipo Mensaje con aquellos que tengan fecha y hora dentro de los parámetros
       ingresados. */
     public List<Mensaje> traerMensaje(LocalDate fecha,LocalTime horaDesde,LocalTime horaHasta) {
    	 List<Mensaje> mensajes = new ArrayList<Mensaje>();
         
    	 for(int indice=0; indice<listaMensajes.size(); indice++) {
    		 if(listaMensajes.get(indice).getFechaEnvio().isEqual(fecha) && listaMensajes.get(indice).getHoraEnvio().isAfter(horaDesde)
    				 && listaMensajes.get(indice).getHoraEnvio().isBefore(horaHasta)) {
    			 mensajes.add(listaMensajes.get(indice));
    		 }
    	 }
    	 return mensajes;
     }
     /*+ traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta, String
      codigoCompania) : Mensaje //retorna una lista del tipo Mensaje con aquellos que tengan fecha y
      hora dentro de los parámetros ingresados y además contentan operador origen de código
      compañía con la compañía que ingresa como parámetro.*/

     public List<Mensaje> traerMensaje(LocalDate fecha, LocalTime horaDesde, LocalTime horaHasta, String codigoCompania){
    	 List<Mensaje> mensajes = new ArrayList<Mensaje>();
    	 List<Mensaje> auxList = traerMensaje(fecha,horaDesde,horaHasta);
    	 
    	 for(int indice=0; indice<auxList.size(); indice++) {
    		 if(auxList.get(indice) instanceof SMS) {
    			 SMS sms = (SMS) auxList.get(indice);
    			 if(sms.getOperadorOrigen().getCompaniaMovil().equalsIgnoreCase(codigoCompania)) {
    				 mensajes.add(sms);
    			 }
    		 }
    	 }	 
    	 return mensajes;
     }
}
