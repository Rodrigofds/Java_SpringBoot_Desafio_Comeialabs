<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section class="content">
	      
	<div class="container-fluid"> 
	<div class="mt-5 text-center text-uppercase">
		<h4 class="h4 font-weight-bold">Lista de Tarefas</h4>
	</div>
	<div class="border p-2">	
		<div class="">			
			<button class="btn btn-sm bg-gradient-primary d-block float-right" type="button" onclick="location.href='${pageContext.request.contextPath}/tarefas/add'"><i class="fas fa-plus-circle mx-2"></i>Adicionar</button>				 
		</div>	
	</div>
	
	<div class="p-2 bg-white">		
		<table id="Tabela" class="table table-sm table-hover table-bordered">
			<thead class="bg-gradient-secondary">	
				<tr>
					<th class="text-center">Código</th>
					<th class="text-center">Descrição</th>
					<th class="text-center">Data</th>	
					<th class="text-center">Status</th>								
					<th class="text-center">Operações</th>
				</tr>
			</thead>
			<c:forEach var="tarefa" items="${listaTarefas}">
			    <tr>	
			    	<td  class="text-center">${tarefa.codigo}</td>
					<td>${tarefa.descricao}</td>
					<td class="text-center"><fmt:formatDate value="${tarefa.showData()}" pattern="dd/MM/yyyy HH:mm"/></td>
					<td  class="text-center">${tarefa.status ? "Realizada" :  "Não Realizada"}</td>
					<td>
						<a class="text-center" data-toggle="tooltip" data-placement="botton" title="Editar" 
					   	   onclick="location.href='${pageContext.request.contextPath}/tarefas-edit/${tarefa.codigo}'"><i class="fas fa-eye fa-lg"></i></a>				  		 
	                </td>					
			    </tr>			    
			</c:forEach>
		</table>
	</div>				
	</div><!-- /.content-fluid -->
</section><!-- /.content -->