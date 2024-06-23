package edu.desafioIPhone.modelos;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  private String name;
  private List<Musica> musicas;

  public Playlist(String name) {
    this.name = name;
    this.musicas = new ArrayList<>();
  }

  public Musica findByTitulo(String titulo){
    for (Musica musica : musicas) {
      if (musica.getTitulo() == titulo)
        return musica;
    }
    return null;
  }

  public String getName() {
    return this.name;
  }

  public List<Musica> getMusicas() {
      return musicas;
  }

  public void adicionarMusica(Musica musica) {
      if (musica != null) {
          musicas.add(musica);
          System.out.println("Música \"" + musica.getTitulo() + "\" adicionada à playlist \"" + name + "\".");
      } else {
          System.out.println("Música inválida.");
      }
  }

  public void removerMusica(Musica musica) {
      if (musicas.contains(musica)) {
          musicas.remove(musica);
          System.out.println("Música \"" + musica.getTitulo() + "\" removida da playlist \"" + name + "\".");
      } else {
          System.out.println("Música não encontrada na playlist.");
      }
  }

}

