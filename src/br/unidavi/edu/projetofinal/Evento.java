package br.unidavi.edu.projetofinal;

import java.util.Date;
import java.util.List;
import br.unidavi.edu.projetofinal.Modalidade;
import java.util.ArrayList;

public class Evento {
    private String descricao;
    private Date data;
    private List<Modalidade> modalidades;

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

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    private void setModalidades(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }

    public Evento(String descricao, Date data) {
        this.descricao = descricao;
        this.data = data;
        
        modalidades = new ArrayList<Modalidade>();
    }

    public Evento(String descricao, Date data, List<Modalidade> modalidades) {
        this.descricao = descricao;
        this.data = data;
        this.modalidades = modalidades;
    }
    
    public Boolean alteraDataEvento(Date novaData) {
        try {
            this.setData(novaData);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void adicionaModalidade(Modalidade modalidade) {
        modalidades.add(modalidade);
    }
    
    public void adicionaModalidade(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }
}
