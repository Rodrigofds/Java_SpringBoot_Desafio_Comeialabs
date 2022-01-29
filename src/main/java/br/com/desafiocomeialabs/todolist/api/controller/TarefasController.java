package br.com.desafiocomeialabs.todolist.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiocomeialabs.todolist.domain.Tarefas;
import br.com.desafiocomeialabs.todolist.domain.service.ListaTarefasService;

@RestController
@RequestMapping("/")
public class TarefasController {

	@Autowired
	private ListaTarefasService tarefasService;
	
	@GetMapping("/tarefas")
	@ResponseStatus(HttpStatus.OK)
	public List<Tarefas> listar(){
		return tarefasService.listarTarefas();
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Tarefas> encontrar(@PathVariable Long tarefaId){
		return tarefasService.encontrarTarefa(tarefaId);
	}
	
	@PostMapping("/tarefas")
	@ResponseStatus(HttpStatus.CREATED)
	public Tarefas adicionar(@RequestBody Tarefas tarefa){
		return tarefasService.criarTarefa(tarefa);
		
	}


}
