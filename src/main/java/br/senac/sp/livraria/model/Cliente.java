package br.senac.sp.livraria.model;

import java.util.Calendar;

import br.senac.sp.livraria.enumeration.Escolaridade;
import br.senac.sp.livraria.enumeration.EstadoCivil;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true, nullable = false)
	private String cpf;
	private String nome;
	private Calendar nascimento;
	private String telefone;
	private String email;
	private String endereco;
	@Column(columnDefinition = "TINYINT")
	private EstadoCivil estadoCivil;
	@Column(columnDefinition = "TINYINT")
	private Escolaridade escolaridade;


}
