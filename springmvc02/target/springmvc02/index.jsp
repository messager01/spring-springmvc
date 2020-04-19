<html>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
<h2>Hello World!</h2>

<hr>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br/>
    <input type="submit" value="upload">
</form>

<a href="${pageContext.request.contextPath}/download/葛雄-java后端简历.pdf">下载简历</a>


<a href="${pageContext.request.contextPath}/local">local</a>
</body>
</html>
