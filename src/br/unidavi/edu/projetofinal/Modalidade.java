package br.unidavi.edu.projetofinal;

import br.unidavi.edu.projetofinal.Competidor;
import java.util.ArrayList;
import java.util.List;

public class Modalidade {
 
    private String descricao;
    private List<Atleta> atletas;
    private List<Equipe> equipes;

    public Modalidade(String descricao) {
        this.descricao = descricao;
        
        atletas = new ArrayList<Atleta>();
        equipes = new ArrayList<Equipe>();
    }  

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void adicionaAtleta(Atleta atleta) {
        atletas.add(atleta);
    }
    
    public void adicionaAtleta(List<Atleta> atletas) {
        this.atletas = atletas;
    }
    
    public void adicionaEquipe(Equipe equipe) {
        equipes.add(equipe);
    }
    
    public void adicionaEquipe(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
