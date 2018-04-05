<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!doctype html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">

<meta charset="utf-8">
<link rel="stylesheet" href="css/base.css"  />
<link rel="stylesheet" type="text/css" href="css/jquery.dialog.css" />
<link rel="stylesheet" href="css/index.css"  />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<title>在线影院票务系统</title>
</head>
<script type="text/javascript">
function reserves(id){
 	 window.location.href="all?id="+id; 
 }
 
 $(function(){
	 var msg = $('#msg').val();
	 if(msg != null && msg !=""){
		 alert(msg);
	 }
	
 });
 
 
</script>
<body style="background-color: white;">
<input type="hidden" id="msg" value="${mssg }">
<div id="container">
	<div id="hd">
    	<div class="hd-wrap ue-clear">
        	<div class="top-light"></div>
            <h1 class="logo">在线影院票务系统</h1>
			
            <div class="login-info ue-clear">
                <div class="welcome ue-clear"><span>欢迎您,</span>${sessionScope.ub.userName}</div>
            </div>
            
			<div class="toolbar ue-clear">
                <a href="javascript:;" class="quit-btn exit"></a>
            </div>
        </div>
    </div>
     <div class="content" style="background-color: white;text-align: center; font-size: 30px ">
            	<!-- <iframe src="home.jsp" id="iframe" width="100%" height="100%" frameborder="0"></iframe> -->
     <table>
    	<thead>
        	<tr style="width: 80px">
                <th class="name">放映厅</th>
                
				<th class="name">电影</th>
				
                <th class="process">放映开始时间</th>
               
                <th class="process">放映结束时间</th>	
                			
                <th class="operate">操作</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${sh}" var="s">
        	<tr style="width: 80px">
                <td class="name">${s.hb.hallName }</td>
               
				<td class="name">${s.mb.movieName }</td>
				
				<td class="process" id="">${s.showTimeStart }</td>
				
				<td class="process">${s.showTimeEnd }</td>
				
                <td class="operate">
					<a href="javascript:reserves(${s.showId})">选座购票</a>
				</td>
            </tr>	
          
         </c:forEach>
        </tbody>
    </table>
 </div>
     
     
     
<div class="exitDialog">
	<div class="dialog-content">
    	<div class="ui-dialog-icon"></div>
        <div class="ui-dialog-text">
        	<p class="dialog-content">你确定要退出系统？</p>
            <p class="tips">如果是请点击“确定”，否则点“取消”</p>
            
            <div class="buttons">
                <input type="button" class="button long2 ok" value="确定" />
                <input type="button" class="button long2 normal" value="取消" />
            </div>
        </div>
        </div>
    </div>
    
    
</div>
</body>
<script type="text/javascript" src="js/jquery.js" ></script>
<script type="text/javascript" src="js/common.js" ></script>
<script type="text/javascript" src="js/core.js" ></script>
<script type="text/javascript" src="js/jquery.dialog.js" ></script>
<script type="text/javascript" src="js/index.js" ></script>
<script type="text/javascript" src="js/layer/layer.js"></script>
<script>

 $('#msg').click(function(e) {
	layer.open({
    type: 2,
    title: '请选择部门',
    fix: false,
    maxmin: true,
    shadeClose: true,
    area: ['800px', '600px'],
    content: 'mail/revList.html',
    end: function(){
      
    }
  });
});


</script>

</html>
