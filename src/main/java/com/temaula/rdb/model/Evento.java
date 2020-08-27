package com.temaula.rdb.model;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.List;

public class Evento implements Serializable
{
    
    private int id;
    private String nome;
    private GregorianCalendar dataInicio;
    private GregorianCalendar dataFim;
    private GregorianCalendar dataCriacao;
    private boolean ativo;
    private String descricao;
    private List<ItemDoacao> itensDoacao;
    private PessoaModel autor;
    private String urlImagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GregorianCalendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(GregorianCalendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public GregorianCalendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(GregorianCalendar dataFim) {
        this.dataFim = dataFim;
    }

    public GregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(GregorianCalendar dataCriacao) {
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

    public PessoaModel getAutor() {
        return autor;
    }

    public void setAutor(PessoaModel autor) {
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
