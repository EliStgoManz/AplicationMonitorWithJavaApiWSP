package modelo;

/*@author: Elí Santiago Manzano*/
public class Respuestas {
	
	private int incidencias_id;
	private String host;
	private String path;
	private String fecha;
	private int responseCode;
	
  
	public Respuestas(int incidencias_id, String host, String path, String fecha, int responseCode) {
		super();
		this.incidencias_id = incidencias_id;
		this.host = host;
		this.path = path;
		this.fecha = fecha;
		this.responseCode = responseCode;
	}


	@Override
	public String toString() {
		return "Respuestas [incidencias_id=" + incidencias_id + ", host=" + host + ", path=" + path + ", fecha=" + fecha
				+ ", responseCode=" + responseCode + "]";
	}


	public Respuestas() {
		
	}
	
	
	public int getIncidencias_id() {
		return incidencias_id;
	}


	public void setIncidencias_id(int incidencias_id) {
		this.incidencias_id = incidencias_id;
	}


    public String getHost() {
		return host;
	}



	public void setHost(String host) {
		this.host = host;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public int getResponseCode() {
		return responseCode;
	}



	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
	
	
	
	

}
