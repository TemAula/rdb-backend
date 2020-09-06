package com.temaula.rdb.model;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class ItemDoacao implements Serializable
{
    
    private int id;
    private CategoriaItem categoria;
    private String nome;
    private double valorReferencia;
    private boolean ativo;
    private GregorianCalendar dataCriacao;
    private Pessoa autor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoriaItem getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaItem categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorReferencia() {
        return valorReferencia;
    }

    public void setValorReferencia(double valorReferencia) {
        this.valorReferencia = valorReferencia;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public GregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(GregorianCalendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }
    
            
}
