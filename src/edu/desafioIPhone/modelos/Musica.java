package edu.desafioIPhone.modelos;

public class Musica {
  private String titulo;
  private int ano;
  private String artista;
  private String album;
  private String genero;
  private String caminhoArquivo;
  private String audio;
  private double tempoFaixa;
  private boolean favorito;

  public Musica(String titulo, int ano, String artista) {
      this.titulo = titulo;
      this.ano = ano;
      this.artista = artista;
  }

  public Musica(String titulo, int ano, String artista, String album, String genero, String caminhoArquivo, String audio, double tempoFaixa) {
      this(titulo, ano, artista);
      this.album = album;
      this.genero = genero;
      this.caminhoArquivo = caminhoArquivo;
      this.audio = audio;
      this.tempoFaixa = tempoFaixa;
  }

  public String getTitulo() {
      return titulo;
  }

  public int getAno() {
      return ano;
  }

  public String getArtista() {
      return artista;
  }

  public String getAlbum() {
      return album;
  }

  public String getGenero() {
      return genero;
  }

  public String getCaminhoArquivo() {
      return caminhoArquivo;
  }

  public String getAudio() {
      return audio;
  }

  public double getTempoFaixa() {
      return tempoFaixa;
  }

  public boolean isFavorito() {
      return favorito;
  }

  public void setTitulo(String titulo) {
      this.titulo = titulo;
  }

  public void setAno(int ano) {
      if (ano > 0) { // validacao basica para prevenir colocar ano inferior a 0
          this.ano = ano;
      } else {
          throw new IllegalArgumentException("Ano must be positive.");
      }
  }

  public void setArtista(String artista) {
      this.artista = artista;
  }

  public void setAlbum(String album) {
      this.album = album;
  }

  public void setGenero(String genero) {
      this.genero = genero;
  }

  public void setCaminhoArquivo(String caminhoArquivo) {
      this.caminhoArquivo = caminhoArquivo;
  }

  public void setAudio(String audio) {
      this.audio = audio;
  }

  public void setTempoFaixa(double tempoFaixa) {
      if (tempoFaixa > 0) { // validacao basica para prevenir colocar tempo inferior a 0 segundos
          this.tempoFaixa = tempoFaixa;
      } else {
          throw new IllegalArgumentException("Tempo da faixa must be positive.");
      }
  }

  public void setFavorito(boolean favorito) {
      this.favorito = favorito;
  }

  public String getInfo() {
      return "Titulo: " + titulo + "\n" +
             "Ano: " + ano + "\n" +
             "Artista: " + artista + "\n" +
             (album != null ? "Album: " + album + "\n" : "") +  // Inclue informacao do album se disponivel
             (genero != null ? "Genero: " + genero + "\n" : "") +   // Inclue informacao do genero se disponivel
             "Caminho do arquivo: " + caminhoArquivo + "\n" +
             "Formato de audio: " + audio + "\n" +
             "Tempo da faixa: " + tempoFaixa + "\n" +
             "Favorito: " + favorito;
  }

}
