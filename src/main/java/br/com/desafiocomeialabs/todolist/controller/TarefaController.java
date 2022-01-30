package br.com.desafiocomeialabs.todolist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.desafiocomeialabs.todolist.domain.Tarefas;
import br.com.desafiocomeialabs.todolist.domain.service.ListaTarefasService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class TarefaController {
	
	private ListaTarefasService tarefasService;

	@GetMapping(value = { "/", "/home" })
    public String homePage(Model model) {
        return "homePage";
    }
	
	@GetMapping(value = {"/tarefasPage"})
	public String tarefas(Model model) {
		List<Tarefas> resultado = tarefasService.listarTarefas();
		model.addAttribute("listaTarefas", resultado);    
		return "tarefasPage";
	}
	
	@GetMapping(value = {"/tarefas/add"})
	public String formulario(Model model) {
		var tarefa = new Tarefas();
		model.addAttribute("modelForm", tarefa);    
		return "formulario";
	}
	
	@GetMapping(value = {"/tarefasPageAjax"})
	public String tarefasAjax() {
		return "tarefasPageAjax";
	}
}
