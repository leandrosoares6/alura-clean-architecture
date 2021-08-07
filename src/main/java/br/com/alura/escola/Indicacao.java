package br.com.alura.escola;

import java.time.LocalDateTime;

public class Indicacao {
  
  private final Aluno indicado;

  private final Aluno indicante;

  private final LocalDateTime dataIndicacao;

  public Indicacao(final Aluno indicado, final Aluno indicante) {
    this.indicado = indicado;
    this.indicante = indicante;
    this.dataIndicacao = LocalDateTime.now();
  }

  public Aluno getIndicado() {
    return indicado;
  }

  public Aluno getIndicante() {
    return indicante;
  }

  public LocalDateTime getDataIndicacao() {
    return dataIndicacao;
  }
  
}
