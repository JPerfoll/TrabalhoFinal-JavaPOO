package br.unidavi.edu.projetofinal;

public class Modalidade {
 
    public String descricao;
    public int tipoModalidade; // 1 - individual  |  2 - time
    
    public Modalidade(String descricao, int tipoModalidade) {
        this.descricao = descricao;
        this.tipoModalidade = tipoModalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipoModalidade() {
        return tipoModalidade;
    }

    public void setTipoModalidade(int tipoModalidade) {
        this.tipoModalidade = tipoModalidade;
    }
}
