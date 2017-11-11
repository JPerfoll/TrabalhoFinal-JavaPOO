package br.unidavi.edu.projetofinal;

import java.util.Date;

abstract class Evento {
    private String descricao;
    private Date data;
    private int eventoId;

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    private void setData(Date data) {
        this.data = data;
    }

    public Evento(String descricao, Date data, int eventoId) {
        this.descricao = descricao;
        this.data = data;
        this.eventoId = eventoId;
    }
    
    public boolean alteraDataEvento(Date novaData) {
        try {
            this.setData(novaData);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }
}
