<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="./js/jquery-1.11.1.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	jQuery(".pMenu").bind("mouseover",function(){
		$(this).next().css("visibility","visible");
	});
	jQuery(".pMenu").bind("mouseout",function(){
		$(this).next().css("visibility","hidden");
	});
})
</script>
<style type="text/css">
.Header_top {
	height: 70px;
	width: 950px;
	background-color: #04623f;
}
.sub_menu_li {
	text-align: left;
	background-color: #04623f;
}
#container {
	margin: 0 auto;
	width: 950px;
	padding:0 5px;
/* 	background:#FFF url(resource/images/background.png) repeat-y; */
}
#bodyer {
	margin: 0 auto;
	width: 950px;
	padding:0 5px;
	padding-top:200px;
	background:#FFF ;
}
</style>

</head>
<body>
<div id="container" style="position: fixed">
	<div class="Header_top">
		<table>
			<tr>
				<c:forEach items="${menus }" var="pMenu">
					<td height="88" width="120" align="center"><a class="pMenu">${pMenu.name }</a>
						<ul style="position:fixed;visibility:hidden; z-index:100">
							<c:forEach items="${pMenu.subMenus }" var="sMenu">
								<li class="sub_menu_li" >${sMenu.name }</li>
							</c:forEach>
						</ul>
					</td>
				</c:forEach>
			</tr>
		</table>
		
	</div>
</div>

<div id="bodyer" >

</div>
</body>
</html>