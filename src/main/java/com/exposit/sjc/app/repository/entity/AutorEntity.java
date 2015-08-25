package com.exposit.sjc.app.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autor")
public class AutorEntity {
	@Id
	@Column(name = "id_autor")
	private Long idAutor;

	@Column(name = "autor_fio")
	private String autorFio;

	public AutorEntity() {
	}

	public AutorEntity(Long idAutor, String autorFio) {
		super();
		this.idAutor = idAutor;
		this.autorFio = autorFio;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getAutorFio() {
		return autorFio;
	}

	public void setAutorFio(String autorFio) {
		this.autorFio = autorFio;
	}

}
