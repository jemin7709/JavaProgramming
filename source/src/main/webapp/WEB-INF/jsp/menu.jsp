<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String sessionId = null;
	if(session.getAttribute("ID")!=null){
		sessionId = (String)session.getAttribute("ID");
	}
	if(request.getAttribute("out")!=null){
		PrintWriter print = response.getWriter();
		session.invalidate();
		print.println("<script>");
		print.println("location.href='http://localhost:8080/welcome.do'");
		print.println("</script>");
	}
	pageContext.setAttribute("sessionId", sessionId);
%>
<nav class="navbar navbar-expand  navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="/welcome.do">Home</a>
		</div>
		<div>
			<ul class="navbar-nav mr-auto">
				<c:choose>
					<c:when test="${empty sessionId}">
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/loginMember.do"/>">로그인 </a></li>
						<li class="nav-item"><a class="nav-link" href='<c:url value="/member/addMember.do"/>'>회원 가입</a></li>
					</c:when>
					<c:otherwise>
						<li style="padding-top: 7px; color: white">[${sessionId}님]</li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/logoutMember.do"/>">로그아웃 </a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/updateMember.do"/>">회원 수정</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</nav>
