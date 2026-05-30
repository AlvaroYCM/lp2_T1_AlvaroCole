package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Dentista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	@EqualsAndHashCode.Include
	private Integer Dentista;
	
	@Column(name = "cop")
	private String cop;
	
	@Column(name = "nombre_completo")
	private String nombre_completo;

	@Column(name = "fecha_inicio_contrato")
	private Date fecha_inicio_contrato;

	@Column(name = "turno")
	private String turno;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "id_especialidad")
	private String id_especialidad;

	public String getTurno() {
		switch (turno) {
		case "M":
			return "Mañana";
		case "T":
			return "Tarde";
		case "N":
			return "Noche";
		default:
			return "Desconocido";
		}
	}
	
	
	@Override
	public String toString() {
		return nombre_completo;
	}
}
