package edu.desafioIPhone.aplicativos;

/**
 * Reprodutor
 */
public interface Reprodutor {
  public void tocar();
  public void proximo();
  public void anterior();
  public void pausar();
  public void selecionarTempo();
  public boolean isReproduzindo();
} 