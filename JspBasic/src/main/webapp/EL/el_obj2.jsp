<%@page import="user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		User user = (User)session.getAttribute("member");
	%>
	
	<p>
		# 이름 : <%=user.getUserName() %><br>
		# 아이디 : <%=user.getUserId() %><br>
		# 비밀번호 : <%=user.getUserPw() %><br>
		# 이메일 : <%=user.getUserEmail() %><br>
		
		
	</p>
	
	<hr>
	
	<p>
	<%-- el을 이용해서 객체 내의 필드 값을 꺼낼때는 
		변수명을 입력하면 해당 필드의 getter 메서드를 알아서 호출합니다. --%>
		#이름 :${sessionScope.member.userName}<br>
		#아이디 :${member.userId}<br>
		#이메일 :${member.userEmail}<br>
		#비밀번호 :${member.userPw}
	</p>
	
	
	
	
	
	
</body>
</html>