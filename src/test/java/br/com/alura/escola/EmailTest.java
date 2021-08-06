package br.com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailTest {
  
  @Test
  public void naoDeveriaCadastrarEmailsComEnderecosInvalidos() {
    assertThrows(IllegalArgumentException.class, () -> new Email(null));
    assertThrows(IllegalArgumentException.class, () -> new Email(""));
    assertThrows(IllegalArgumentException.class, () -> new Email("EMAIL_INVALIDO"));
  }
}
