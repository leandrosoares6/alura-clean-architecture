package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CpfTest {
  
  @Test
  void naoDeveriaCadastrarCPFComNumeroInvalido() {
    assertThrows(IllegalArgumentException.class, () -> new CPF(null));
    assertThrows(IllegalArgumentException.class, () -> new CPF(""));
    assertThrows(IllegalArgumentException.class, () -> new CPF("CPF_INVALIDO"));
  }

  @Test
  void deveriaRetornarInstanciaDeCpfQuandoValido() {
    assertNotNull(new CPF("046.947.573-00"));
  }
}
