package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "empreendedor")


public class Empreendedor {

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (name = "id")
    private Integer id; 

    @Column (name = "nome")
    private String nome;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "data_nascimento")
    private LocalDate dataNascimento;


    @ManyToMany 
    @JoinTable(
        name = "empreendedor_produto", 
        joinColumns = @JoinColumn(name = "empreendedor_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(name = "produto_id", referencedColumnName = "id")
    )
    private List<Produto> produtos;


    public Empreendedor() {
    }

    public Empreendedor(String cpf, LocalDate dataNascimento, Integer id, String nome, List<Produto> produtos) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.id = id;
        this.nome = nome;
        this.produtos = produtos;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }


}
