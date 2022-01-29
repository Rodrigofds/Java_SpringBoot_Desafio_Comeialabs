package br.com.desafiocomeialabs.todolist.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafiocomeialabs.todolist.domain.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

//	List<Tarefas> findByDescricao(String descricao);
}
