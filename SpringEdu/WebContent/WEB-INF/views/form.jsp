<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- action 생략 -->    
<form action="edit.do" method="post">
	제목 : 
	<input type="text" name="title" value="${board.title}"><br>
	작성자 : ${board.writeId}<br>
	<input type="submit">
</form>