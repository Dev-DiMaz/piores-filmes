package com.dmazui.pioresfilmes.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filmes")
public class Filme implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String title;
	private Integer year;
	private String studios;
	private String producers;
	private String winner;

}
