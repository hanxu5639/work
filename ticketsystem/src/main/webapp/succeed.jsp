<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预订成功</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<style type="text/css">
th{
  width: 80px;
  text-align: center;
}
td{
  width: 80px;
  text-align: center;
}


</style>
</head>
<script type="text/javascript">
  $(function(){
	  $('#goOut').click(function(){
		  window.location.href="logout";
	  });
  });

</script>
<body>
<div align="right">
		<input type="button" value="退出" id="goOut">
</div>
  ${mssg }
  <table border="2px" cellpadding="0" cellspacing="0">
      <p>预订信息</p>
      <tr>
        <th>预订时间</th>
        <th>电影名</th>
        <th>放映厅</th> 
        <th>座位</th> 
        <th>放映开始时间</th>
        <th>放映结束时间</th>      
      </tr>
      <tr>
        <td>${sa.saleTime }</td>
        <td>${sa.shb.mb.movieName }</td>
        <td>${sa.shb.hb.hallName }</td>
        <td>${sa.seb.seatNum }</td>
        <td>${sa.shb.showTimeStart }</td>
        <td>${sa.shb.showTimeEnd }</td>
      </tr>
  
  </table>
</body>
</html>