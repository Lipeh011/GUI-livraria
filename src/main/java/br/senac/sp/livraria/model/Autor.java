package br.senac.sp.livraria.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Autor {	
	@Id
	private String codigo;
	@Column(columnDefinition = "VARCHAR(100)")
	private String nome;
	@Column(columnDefinition = "VARCHAR(200)")
	private String sobrenome;
	private Calendar dataNascimento;
}
