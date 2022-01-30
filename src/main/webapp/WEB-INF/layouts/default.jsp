<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE>
<html lang="pt-br">
	<head>    
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <title><tiles:getAsString name="title"/></title>   
    		     
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/adminlte.min.css"/>
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/fontawesome/css/all.min.css"/>
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/styles.css"/>
	   	   	    
    </head>  
	<body class="hold-transition sidebar-mini layout-navbar-fixed layout-fixed">	
	
		<div class="wrapper">	
			
			<tiles:insertAttribute name="menu"/>
		
			<div class="content-wrapper">
			
				<tiles:insertAttribute name="notificacao"/>				
				
				<tiles:insertAttribute name="body"/>				
					
			</div>	
			
		</div>
							
		
		<script charset="UTF-8" type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>			
		<script charset="UTF-8" type="text/javascript" src="${pageContext.request.contextPath}/static/js/adminlte.min.js"></script>		
    </body>
</html>
