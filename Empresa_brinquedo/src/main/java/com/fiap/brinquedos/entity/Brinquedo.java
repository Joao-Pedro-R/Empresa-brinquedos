package com.fiap.brinquedos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "TDS_TB_Brinquedos")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome e obrigatorio")
    private String nome;

    @NotBlank(message = "Tipo e obrigatorio")
    private String tipo;

    @NotBlank(message = "Classificacao e obrigatoria")
    private String classificacao;

    @NotBlank(message = "Tamanho e obrigatorio")
    private String tamanho;

    @NotNull(message = "Preco e obrigatorio")
    @DecimalMin(value = "0.0", inclusive = false, message = "Preco deve ser maior que zero")
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome e obrigatorio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome e obrigatorio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Tipo e obrigatorio") String getTipo() {
        return tipo;
    }

    public void setTipo(@NotBlank(message = "Tipo e obrigatorio") String tipo) {
        this.tipo = tipo;
    }

    public @NotBlank(message = "Classificacao e obrigatoria") String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(@NotBlank(message = "Classificacao e obrigatoria") String classificacao) {
        this.classificacao = classificacao;
    }

    public @NotBlank(message = "Tamanho e obrigatorio") String getTamanho() {
        return tamanho;
    }

    public void setTamanho(@NotBlank(message = "Tamanho e obrigatorio") String tamanho) {
        this.tamanho = tamanho;
    }

    public @NotNull(message = "Preco e obrigatorio") @DecimalMin(value = "0.0", inclusive = false, message = "Preco deve ser maior que zero") BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(@NotNull(message = "Preco e obrigatorio") @DecimalMin(value = "0.0", inclusive = false, message = "Preco deve ser maior que zero") BigDecimal preco) {
        this.preco = preco;
    }
}
