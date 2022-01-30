package br.com.desafiocomeialabs.todolist.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tarefas")
public class Tarefas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank
	private String descricao;

	@CreationTimestamp
	private LocalDateTime data;
	
	private Boolean status;
	
	public Date showData() {
		return Date.from(this.data.atZone(ZoneId.systemDefault()).toInstant());
	}

}
