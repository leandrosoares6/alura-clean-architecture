package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TelefoneTest {
  
  @Test
  void naoDeveriaCadastrarTelefoneComDddEOuNumeroInvalidos() {
    assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
    assertThrows(IllegalArgumentException.class, () -> new Telefone(null, ""));
    assertThrows(IllegalArgumentException.class, () -> new Telefone("", null));
    assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "988888888"));
    assertThrows(IllegalArgumentException.class, () -> new Telefone("86", null));
  }

  @Test
  void deveriaRetornarInstanciaDeTelefoneQuandoValido() {
    assertNotNull(new Telefone("86", "88888888"));
    assertNotNull(new Telefone("86", "988888888"));
  }
}
