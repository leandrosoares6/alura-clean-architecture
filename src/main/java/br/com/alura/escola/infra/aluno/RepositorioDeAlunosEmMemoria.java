package br.com.alura.escola.infra.aluno;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

  private List<Aluno> alunos;

  @Override
  public void matricular(Aluno aluno) {
    alunos.add(aluno);
    
  }

  @Override
  public Aluno buscarPorCPF(CPF cpf) {
    return alunos.stream()
      .filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
      .findFirst()
      .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
  }

  @Override
  public List<Aluno> listarTodosAlunosMatriculados() {
    return alunos;
  }
  
}
