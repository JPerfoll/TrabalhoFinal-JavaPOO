package br.unidavi.edu.projetofinal;

import java.util.Date;
import br.unidavi.edu.projetofinal.Evento;
import br.unidavi.edu.projetofinal.Modalidade;
import br.unidavi.edu.projetofinal.Competidor;
import br.unidavi.edu.projetofinal.Atleta;
import br.unidavi.edu.projetofinal.Equipe;
import java.util.ArrayList;
import java.util.List;

public class TesteTrabalhoFinalOO {

    public static void main(String[] args) {
        Date data = new Date("12/07/2017");
        
        /* Exemplo de criação de Evento adicionando uma lista de modalidades */
        Evento evento = new Evento("Rio 2016 - Dia 1", data);
        
        List<Modalidade> modalidades = new ArrayList<Modalidade>();
        
        /* Essa competição é individual, portanto adiciona uma lista de atletas */
        Modalidade modalidade = new Modalidade("100M rasos");
        List<Atleta> atletas = new ArrayList<Atleta>();
        
        Atleta atleta1 = new Atleta("João Carlos", "Perna Longa", 28);
        Atleta atleta2 = new Atleta("Pedro Paulo", "Tonico", 31);
        Atleta atleta3 = new Atleta("Enzo Ferrari", "Boy", 24);
        Atleta atleta4 = new Atleta("Vilson Rocha", "Rocha", 35);
        
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);
        atletas.add(atleta4);
        
        modalidade.adicionaAtleta(atletas);
        modalidades.add(modalidade);
        
        /* Essa competição é em time, portanto adiciona um time e adiciona atletas ao time */
        Modalidade modalidade2 = new Modalidade("Voleibol");
        List<Equipe> equipes = new ArrayList<Equipe>();
        
        Equipe equipe1 = new Equipe("Holanda", "Laranja Mecânica", 102);
        equipe1.adicionaAtleta(new Atleta("João", "Canário", 35));
        equipe1.adicionaAtleta(new Atleta("Marcos", "João de Barro", 32));
        equipe1.adicionaAtleta(new Atleta("Pedro", "Calopsita", 31));
        
        Equipe equipe2 = new Equipe("Itália", "Azurra", 109);
        equipe2.adicionaAtleta(new Atleta("Vicente", "Apelido 1", 37));
        equipe2.adicionaAtleta(new Atleta("Vilson", "Apelido 2", 39));
        equipe2.adicionaAtleta(new Atleta("Joanir", "Apelido 3", 31));
        
        equipes.add(equipe1);
        equipes.add(equipe2);
        
        modalidade2.adicionaEquipe(equipes);        
        modalidades.add(modalidade2);
        
        // Adiciona as modalidades ao evento
        evento.adicionaModalidade(modalidades);
        
        
        /* Exemplo de criação de Evento já passando uma lista de modalidades como parâmetro */
        Evento evento2 = new Evento("Rio 2016 - Dia 2", data, modalidades);
        
        /* Exemplo de criação de Evento inserindo individualmente as modalidades depois do evento já criado */
        Evento evento3 = new Evento("Rio 2016 - Dia 3", data);
        
        evento3.adicionaModalidade(new Modalidade("100M rasos")); 
    }
    
}
