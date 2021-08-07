package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.aluno.CPF;

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
