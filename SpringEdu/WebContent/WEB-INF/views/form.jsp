<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- action ���� -->    
<form action="edit.do" method="post">
	���� : 
	<input type="text" name="title" value="${board.title}"><br>
	�ۼ��� : ${board.writeId}<br>
	<input type="submit">
</form>