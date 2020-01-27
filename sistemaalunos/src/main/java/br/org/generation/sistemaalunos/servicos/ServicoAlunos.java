package br.org.generation.sistemaalunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.dao.IAlunoBD;
import br.org.generation.sistemaalunos.model.Aluno;

@Component
public class ServicoAlunos implements IAlunoService {

	@Autowired 		// injeta uma dependência no banco de dados "ele dá o NEW" - indica que o
					// gerenciamento do obj é por conta do JPA
	IAlunoBD repo;	// repo de repositório (uma alusão ao banco de dados)

	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno); 	// o save vem do crudrepository, ele é quem salva no banco
		}
		catch(Exception ex) {
			throw new RuntimeException("Erro ao atualizar aluno no banco");
		}
		
	}
	
	public void atualizarAlunoNoBanco(Aluno aluno) {
		repo.save(aluno);
		}

	public Aluno recuperarAlunoPorId(int id) {
		return repo.findById(id).get();
		}
}