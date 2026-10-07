package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtor")


public class Produto {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "data_fabricacao")
    private Date dataFabricacao;

    @Column (name = "preco")
    private Double preco;

    public Produto() {
    }

    public Produto(Integer id, String nome, Date dataFabricacao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.dataFabricacao = dataFabricacao;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    



}
