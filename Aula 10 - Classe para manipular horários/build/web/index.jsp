<%-- 
    Document   : index
    Created on : 25 de abr de 2022, 19:33:37
    Author     : Guilherme Neves
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="demo.Horario"%>
<%
     Horario hora;
      hora = new Horario(14,49,50);
      hora.getHora();
      hora.getMinuto();
      hora.getSegundo();
      for(int c=0;c<20;++c) hora.decrementa();
      
%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Tarefa - POO</title>
    </head>
    <body>
        <h2>Aula 10</h2>
        <h3>POO - Classe para manipular horários</h3>       
        <hr>
        <h2>Guilherme Neves</h2>
        <h3>Horário do intervalo:  <%= hora.getHoraIntervalo()%></h3>
        <h3>Horário atual :<%Date nov = new Date();out.print(nov);%></h3>
      
</html>
