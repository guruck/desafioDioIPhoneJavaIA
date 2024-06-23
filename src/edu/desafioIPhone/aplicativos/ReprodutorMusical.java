package edu.desafioIPhone.aplicativos;

import java.util.List;

import edu.desafioIPhone.modelos.Album;
import edu.desafioIPhone.modelos.EstadoReproducao;
import edu.desafioIPhone.modelos.Musica;
import edu.desafioIPhone.modelos.Playlist;

/**
 * Reprodutor
 */
public class ReprodutorMusical implements Reprodutor {
  private Musica musicaAtual;

  private List<Playlist> biblioteca;
  private Playlist playlistAtual;

  private List<Album> coletanea;
  private Album albumAtual;

  private boolean reproduzindo;
  private boolean modoAleatorio;
  private EstadoReproducao estadoReproducao;

  @Override
  public void tocar(){
    if (this.isReproduzindo()) {
      this.estadoReproducao = EstadoReproducao.REPRODUZINDO;
      System.out.println("Tocando a Musica " + musicaAtual.getTitulo());
    } else {
      this.estadoReproducao = EstadoReproducao.PARADO;
      System.out.println("Parando a Musica " + musicaAtual.getTitulo());
    }
  }
  @Override
  public void proximo(){
    this.estadoReproducao = EstadoReproducao.REPRODUZINDO;
    System.out.println("Tocando a proxima Musica");
  }
  @Override
  public void anterior(){
    this.estadoReproducao = EstadoReproducao.REPRODUZINDO;
    System.out.println("Tocando a Musica anterior");
  }
  @Override
  public void pausar(){
    this.estadoReproducao = EstadoReproducao.PAUSADO;
    System.out.println("Musica pausada...");
  }
  @Override
  public void selecionarTempo(){
    System.out.println("Selecionando dentre o tempo da Faixa Musical...");
  }

  @Override
  public boolean isReproduzindo() {
    return this.reproduzindo;
  }

  public EstadoReproducao getEstadoReproducao(){
    return this.estadoReproducao;
  }

  public void setEstadoReproducao(EstadoReproducao estadoReproducao) {
    this.estadoReproducao = estadoReproducao;
  }

  public Musica selecionarMusica(String titulo){
    Musica musicaSelecionada = new Musica(titulo, 0, "artista desconhecido");

    for (Playlist playlist : biblioteca) {
      musicaSelecionada = playlist.findByTitulo(titulo);
    }

    return musicaSelecionada;
  }

  public Album selecionarAlbum(String album){
    if (this.albumAtual.getName() == album)
      return this.albumAtual;

    for (Album disco : coletanea) {
      if (disco.getName() == album)
        this.albumAtual = disco;
        return disco;
    }
    return null;
  }

  public Playlist selecionarPlaylist(String playlist){
    if (this.playlistAtual.getName() == playlist)
      return this.playlistAtual;

    for (Playlist list : biblioteca) {
      if (list.getName() == playlist)
        this.playlistAtual = list;
        return list;
    }
    return null;
  }

  public void selecionatModoAleatorio(){
    this.modoAleatorio = !modoAleatorio;
    if (this.modoAleatorio)
      System.out.println("Modo aleatório LIGADO");
    else
      System.out.println("Modo aleatório DESLIGADO");
  }

  public void favoritarMusica(Musica musica){
    if (musica.isFavorito()){
      musica.setFavorito(false);
      System.out.println("Musica removida dos FAVORITADOS");
    }else{
      musica.setFavorito(true);
      System.out.println("Musica adicionada aos FAVORITADOS");
    }
  }
} 