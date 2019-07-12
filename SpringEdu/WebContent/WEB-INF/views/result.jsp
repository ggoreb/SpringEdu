<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<body>
	<h1>Content</h1>
	전체내용 : ${content}
	<br> 제목 : ${content.title}
	<br> 작성자 : ${content.writeId}
	<br>
	<select name="searchTypeList">
		<option value="all">${searchTypeList[0]}</option>
		<option value="item">${searchTypeList[1]}</option>
		<option value="character">${searchTypeList[2]}</option>
	</select>
</body>