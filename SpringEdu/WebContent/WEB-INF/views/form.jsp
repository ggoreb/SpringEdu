<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- action 积帆 -->    
<form action="edit.do" method="post">
	力格 : 
	<input type="text" name="title" value="${board.title}"><br>
	累己磊 : ${board.writeId}<br>
	<input type="submit">
</form>