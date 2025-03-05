package com.compras.hoteis.model;

import jakarta.persistence.*;

@Entity
@Table(name="hotel",
    schema = "compras")
public class M_Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String urlAcesso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlAcesso() {
        return urlAcesso;
    }

    public void setUrlAcesso(String urlAcesso) {
        this.urlAcesso = urlAcesso;
    }
}
