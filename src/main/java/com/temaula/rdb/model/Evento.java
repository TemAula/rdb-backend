package com.temaula.rdb.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;

public class Evento implements Serializable
{
    
    private int id;
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private LocalDate dataCriacao;
    private boolean ativo;
    private String descricao;
    private List<ItemDoacao> itensDoacao;
    private Pessoa autor;
    private String urlImagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemDoacao> getItensDoacao() {
        return itensDoacao;
    }

    public void setItensDoacao(List<ItemDoacao> itensDoacao) {
        this.itensDoacao = itensDoacao;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
