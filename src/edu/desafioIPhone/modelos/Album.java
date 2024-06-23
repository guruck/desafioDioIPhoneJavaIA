package edu.desafioIPhone.modelos;

import java.util.List;

public class Album {

  private String name;
  private String capa; //representativo apenas, deveria ser uma imagem
  private List<Musica> musicas;

  public String getName(){
    return this.name;
  }

  public String getCapa(){
    return this.capa;
  }

  public void setCapa(String capa){
    this.capa = capa;
  }

  public void addMusica(Musica musica){
    musicas.add(musica);
  }

  public void removeMusica(Musica musica){
    musicas.remove(musica);
  }

  public void setMusicas(List<Musica> musicas){
    this.musicas.addAll(musicas);
  }

  public List<Musica> getMusicas(){
    return this.musicas;
  }

  public Musica getMusica(String titulo){
    for (Musica musica : musicas) {
      if (musica.getTitulo() == titulo)
        return musica;
    }
    return null;
  }

  @Override
  public String toString() {
    return "Nome do Album: " + this.name + "\n" + "Capa do Album: " + this.capa;
  }
}
