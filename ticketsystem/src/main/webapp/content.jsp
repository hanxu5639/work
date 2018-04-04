<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<meta charset="utf-8">
<title>选座</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<style>
#a {
	margin-left: 25%;
	width: 630px;
}

#a1 {
	font-size: 20px;
	font-family: "宋体";
	color: green;
	background-color: skyblue;
	text-align: center;
	line-height: 50px;
	height: 50px;
}

#a2 {
	height: 30px;
}

a {
	text-decoration: none
}

td {
	width: 70px;
	text-align: center;
}

table {
	background-color: forestgreen;
}
</style>
<script type="text/javascript">
	function res(seatNum, userId, showId) {
		var state = 0;
		window.location.href = "win?seatNum=" + seatNum + "&userId=" + userId
				+ "&showId=" + showId + "&state=" + state;
	}

	function re(id) {
		alert(id);
	}

	function hint() {
		alert("该座位已被预订请选择其他座位!");
	}

	$(function() {
		var state1 = $('#state1').val();
		if (state1 == 1) {
			$('#td1').css("background-color", "green");
		} else {
			$('#td1').css("background-color", "red");
		}

		var state2 = $('#state2').val();
		if (state2 == 1) {
			$('#td2').css("background-color", "green");
		} else {
			$('#td2').css("background-color", "red");
		}

		$('#back').click(function() {
			window.location.href = "back";
		});
	});
</script>
<body>
	<div align="right">
		<input type="button" value="返回" id="back">
	</div>
	<div id="a">
		<div id="a1">
			<p>${sh.mb.movieName }${sh.showTimeStart }-${sh.showTimeEnd }</p>
		</div>
		<div id="a2"></div>
		<div id="a3">
			<table border="1px" cellspacing="0" cellpadding="0">
				<c:if test="${!empty bs }">
					<c:forEach items="${bs }" var="s1" varStatus="status1">
						<c:if test="${(status1.index + 1)%9 == 1 }">
							<tr>
						</c:if>
						<td id="td1"><a href="javascript:hint()">${s1.seatNum }</a><input
							type="hidden" id="state1" value="${s1.workOff }"></td>
						<c:if test="${(status1.index + 1)%9 == 0 }">
							</tr>
						</c:if>
					</c:forEach>
				</c:if>

				<c:if test="${!empty nbs }">
					<c:forEach items="${nbs }" var="s2" varStatus="status2">
						<c:if test="${(status2.index + 1)%9 ==1 }">
							<tr>
						</c:if>
						<td id="td2"><a
							href="javascript:res('${s2.seatNum }','${ub.userId }','${sh.showId }')">${s2.seatNum }</a><input
							type="hidden" id="state2" value="${s2.workOff }"></td>
						<c:if test="${(status2.index + 1)%9 ==0 }">
							</tr>
						</c:if>
					</c:forEach>
				</c:if>
			</table>

		</div>
	</div>
</body>
</html>
