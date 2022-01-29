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
	public void apagarTarefa(Long tarefaId) {
		tarefasRepository.deleteById(tarefaId);
	}

	

	
}