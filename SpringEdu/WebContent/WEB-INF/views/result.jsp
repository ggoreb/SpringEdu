<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<body>
	<h1>Content</h1>
	��ü���� : ${content}
	<br> ���� : ${content.title}
	<br> �ۼ��� : ${content.writeId}
	<br>
	<select name="searchTypeList">
		<option value="all">${searchTypeList[0]}</option>
		<option value="item">${searchTypeList[1]}</option>
		<option value="character">${searchTypeList[2]}</option>
	</select>
</body>