package repositorio;

import java.util.List;

import modelo.Respuestas;

//@author: Elí Santiago Manzano
public interface Repositorio<T> {
	
	//listas todas las incidencias
	List<T>listar();
	
	//listar por id de incidencia
	T porId(int incidencias_id);
	
	//insertar o guardar un nuevo registro
	void guardar(T t);
	
	
	//eliminar un elemento por su id
    void eliminar(int incidencias_id);


	
	
}
