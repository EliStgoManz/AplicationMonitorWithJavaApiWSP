package beans;

import java.sql.Connection;
import java.sql.SQLException;

import datosRecursos.ConexionPoolIncidencias;
import modelo.Respuestas;
import repositorio.Repositorio;
import repositorio.IncidenciasRepositorioImpl;

public class EjemploJdbc {
	
	public static void main(String[]args) throws SQLException {
		try(Connection conn=ConexionPoolIncidencias.getConnection()){
			
			Repositorio<Respuestas> repositorio=new IncidenciasRepositorioImpl();
			System.out.println("=========== Listar ============");
			repositorio.listar().forEach(r->System.out.println(r.getHost()));
			System.out.println("=========== Listar por id============");
			System.out.println(repositorio.porId(1));
			System.out.println("=========== insertar nueva incidencia ============");
			Respuestas respuesta=new Respuestas();
			respuesta.setPath("SISeg/Proceso");
			respuesta.setHost("localhost");
			respuesta.setResponseCode(500);
			respuesta.setFecha("02-07-2024 15:59:28");
			
		 }catch(SQLException e) {
		 e.printStackTrace();
		}
	}

}
