package br.unidavi.edu.projetofinal;

import java.util.Date;
import java.util.List;
import br.unidavi.edu.projetofinal.Competidor;
import br.unidavi.edu.projetofinal.Modalidade;

public class Competicao extends Evento {
    
    private List<Competidor> competidores;  
    private Modalidade modalidade; 
    private Time horaInicio;
    
    public Competicao(Modalidade modalidade, Time horaInicio, String descricao, Date data, int eventoId) {
        super(descricao, data, eventoId);
        this.modalidade = modalidade;
        this.horaInicio = horaInicio;
    }

    public Competicao(List<Competidor> competidores, Modalidade modalidade, Time horaInicio, String descricao, Date data, int eventoId) {
        super(descricao, data, eventoId);
        this.competidores = competidores;
        this.modalidade = modalidade;
        this.horaInicio = horaInicio;
    }
    
    public List<Competidor> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<Competidor> competidores) {
        this.competidores = competidores;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    } 
}
