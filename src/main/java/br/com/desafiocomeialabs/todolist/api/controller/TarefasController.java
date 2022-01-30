package br.com.desafiocomeialabs.todolist.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiocomeialabs.todolist.domain.Tarefas;
import br.com.desafiocomeialabs.todolist.domain.service.ListaTarefasService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TarefasController {

	private ListaTarefasService tarefasService;
	
	@GetMapping("/tarefas")
	@ResponseStatus(HttpStatus.OK)
	public List<Tarefas> listar(){
		return tarefasService.listarTarefas();
	}
	
	@GetMapping("/tarefas/{tarefaId}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Tarefas> encontrar(@PathVariable Long tarefaId){
		return tarefasService.encontrarTarefa(tarefaId);
	}
	
	@PostMapping("/tarefas")
	@ResponseStatus(HttpStatus.CREATED)
	public Tarefas adicionar(@RequestBody Tarefas tarefa){
		return tarefasService.criarTarefa(tarefa);
		
	}
	
	@PutMapping("/tarefas/{tarefaId}")
	public ResponseEntity<Tarefas> atualizar(@PathVariable Long tarefaId, @Valid @RequestBody Tarefas tarefa){
			return tarefasService.atualizarTarefa(tarefaId, tarefa);
	}

	@DeleteMapping("/tarefas/{tarefaId}")
	public ResponseEntity<Void> apagar(@PathVariable Long tarefaId){
		return tarefasService.apagarTarefa(tarefaId);
	}
}
