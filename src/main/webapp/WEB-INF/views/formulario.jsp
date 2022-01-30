<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="content">
	      
	<div class="container-fluid">  	
	
	<div   class="text-center text-uppercase">
		<h4 class="h4 font-weight-bold">nova tarefa</h4>
	</div>	
	
	<form:form class=""  method="POST" modelAttribute="modelForm" action="${pageContext.request.contextPath}/tarefa-salvar">

		<form:hidden path="codigo" />		
		
		<div  class="form-row" >		
			
			  <div class="form-group col-sm-6">
				<label for="descricao">Descrição</label>			
				<form:input path="descricao" maxlength="70" tabindex="1" type="text" class="form-control form-control-sm" id="descricao"  required="required"/>                                
			 </div>			
			
			  <div class="form-group col-sm-3">
				<label for="data">Data</label>			
				<form:input path="data" type="date" maxlength="15" tabindex="2" class="form-control form-control-sm" id="data" required="required"/>                                
			 </div>		
			
		</div>		
		
		<div  class="form-row justify-content-center mt-4" >				
			<div class="form-group col-xs-6 text-center">		
				<button type="submit" tabindex="7" class="btn bg-gradient-success"><i class="fas fa-check-circle mx-2"></i>Cadastrar</button>				
			</div>				
			<div class="form-group  col-xs-6 text-center">		
				<a class="btn bg-gradient-dark" tabindex="8" href="${pageContext.request.contextPath}/tarefasPage"><i class="fas fa-times-circle mx-2"></i>Cancelar</a>				
			</div>
		</div>  		
	</form:form>
	
	</div><!-- /.content-fluid -->
</section><!-- /.content -->