package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	//Atributos escolhidos: id, descricao e nomeCategoria
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo 'Descrição' deve ser preenchido")
	@Size(min = 5, max = 255, message = "O atributo 'Descrição' deve ter entre 5 e 255 caracteres")
	private String descricao;
	
	@JsonIgnoreProperties("categoria")
	private String nomeCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeProduto(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
}
