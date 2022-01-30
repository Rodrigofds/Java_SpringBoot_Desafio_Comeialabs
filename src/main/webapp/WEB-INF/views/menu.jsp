<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars fa-lg"></i></a>
      </li>      
    </ul>  
  
	<!-- Right navbar links -->
    <ul class="navbar-nav ml-auto d-none d-sm-flex">        
		<li class="nav-item">					             
        	<a class="nav-link" data-toggle="tooltip" data-placement="botton" title="Lista de Tarefas" href="${pageContext.request.contextPath}"><i class="far fa-calendar-alt fa-lg"></i></a> 
        </li>
	 </ul>	
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    
   	 <!-- Brand Logo -->
    <a href="${pageContext.request.contextPath}/home" class="brand-link">           
      <img src="<c:url value="/static/img/logoadm.png"/>" alt="" class="brand-image img-circle elevation-3">
      <span class="brand-text font-weight-light">Lista de tarefas</span>
    </a>
     

    <!-- Sidebar -->
    <div class="sidebar">     
      
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="<c:url value="/static/img/logouser.png"/>" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
        	Rodrigo Ferreira
        </div>      
      </div>     

      <!-- Sidebar Menu -->
      <nav class="mt-2">      
      	  <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">          
	          <li class="nav-item">
	            <a href="${pageContext.request.contextPath}/home" class="nav-link">
	              <i class="fas fa-chart-bar nav-icon"></i>
	              <p>
	                INFORMAÇÕES           
	              </p>
	            </a>
	          </li>
	          <li class="nav-item">
	            <a href="${pageContext.request.contextPath}/tarefasPage" class="nav-link">
	              <i class="fas fa-chart-bar nav-icon"></i>
	              <p>
	                LISTA DE TAREFAS           
	              </p>
	            </a>
	          </li>
	          <li class="nav-item">
	            <a href="${pageContext.request.contextPath}/tarefasPageAjax" class="nav-link">
	              <i class="fas fa-chart-bar nav-icon"></i>
	              <p>
	                LISTA DE TAREFAS AJAX           
	              </p>
	            </a>
	          </li>
          </ul>      	       
      </nav> <!-- /.sidebar-menu -->     
    </div> <!-- /.sidebar -->   
  </aside>