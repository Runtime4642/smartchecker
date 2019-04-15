<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<c:url value='/' />assets/css/user.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		
		<div id="content">
			<div id="user">
				<form id="login-form" name="loginform" method="post" action="<c:url value='/' />user/login">
					<label class="block-label" for="email">아이디</label>
					<input id="id" name="id" type="text" value="">
					<input id="password" name="password" type="text" value="">
					
					
					<c:if test="${not empty result}">
							<c:if test="${result eq 'fail'}">
								<p>
								로그인에 실패 했습니다.
								</p>
							</c:if>
					</c:if>
						
					<input type="submit" value="로그인">
				</form>
			</div>
		</div>
		
		
		
	</div>
</body>
</html>