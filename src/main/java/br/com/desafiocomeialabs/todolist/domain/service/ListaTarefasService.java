package br.com.desafiocomeialabs.todolist.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.desafiocomeialabs.todolist.domain.Tarefas;
import br.com.desafiocomeialabs.todolist.domain.repository.TarefasRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ListaTarefasService {
	
	@Autowired
	private TarefasRepository tarefasRepository;

	public List<Tarefas> listarTarefas(){
		return tarefasRepository.findAll();
	}

	@Transactional
	public ResponseEntity<Tarefas> encontrarTarefa(Long tarefaId) {
		return tarefasRepository.findById(tarefaId)
				.map(tarefa -> ResponseEntity.ok().body(tarefa))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@Transactional
	public Tarefas criarTarefa(Tarefas tarefa) {
		return tarefasRepository.save(tarefa);
	}
	
	@Transactional
	public ResponseEntity<Void> apagarTarefa(Long tarefaId) {
		if(!tarefasRepository.existsById(tarefaId))
			return ResponseEntity.notFound().build();
		
		tarefasRepository.deleteById(tarefaId);
		return ResponseEntity.noContent().build();		
	}

	@Transactional
	public ResponseEntity<Tarefas> atualizarTarefa(Long tarefaId, Tarefas tarefaAtualizada) {
		return tarefasRepository.findById(tarefaId)
				.map(tarefa -> {
					tarefa.setCodigo(tarefaId);
					tarefa.setData(tarefaAtualizada.getData());
					tarefa.setDescricao(tarefaAtualizada.getDescricao());
					tarefa.setStatus(tarefaAtualizada.getStatus());
					tarefasRepository.save(tarefa);
					return ResponseEntity.ok().body(tarefa);
				}).orElse(ResponseEntity.notFound().build());
	}

	
}