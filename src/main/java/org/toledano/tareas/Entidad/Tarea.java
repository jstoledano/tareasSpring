package org.toledano.tareas.Entidad;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tarea {
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;

	@Column(name = "materia", nullable = false, length = 4)
	private String materia;

	@Column(name = "unidad", nullable = false, length = 2)
	private String unidad;

	@Column(name = "actividad", nullable = false, length = 3)
	private String actividad;

	@Column(name = "descripcion", nullable = false, length = 150)
	private String descripcion;

	public Tarea() {
	}

	public Tarea(String materia, String unidad, String actividad, String descripcion) {
		this.materia = materia;
		this.unidad = unidad;
		this.actividad = actividad;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "[" + materia + ":" + unidad + ":" + actividad + "] " + descripcion;
	}
}
