<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src='resource/js/jquery-1.11.1.js' type='text/javascript' ></script>

<style type="text/css">
.Header_top {
	height: 30px;
	width: 950px;
	background-color: #04623f;
}
#container {
	margin: 0 auto;
	width: 950px;
	padding:0 5px;
	background:#FFF url(resource/images/background.png) repeat-y;
}
#bodyer {
	margin: 0 auto;
	width: 950px;
	padding:0 5px;
	padding-top:200px;
	background:#FFF ;
}
</style>

<script type="text/javascript">
$(function(){
	jQuery("#tdchange").bind("click",function(){
		jQuery("#mFunction").val("click");
	});
	jQuery("#tdchange").bind("mouseover",function(){
		jQuery("#mFunction").val("in");
		jQuery("#submenu1").css("visibility","visible");
		
	});
	jQuery("#tdchange").bind("mouseout",function(){
		jQuery("#mFunction").val("out");
		jQuery("#submenu1").css("visibility","hidden");
	});
	
	jQuery("#tdchange2").bind("mouseover",function(){
		jQuery("#mFunction").val("2 in");
		jQuery("#submenu2").css("visibility","visible");
		
	});
	jQuery("#tdchange2").bind("mouseout",function(){
		jQuery("#mFunction").val("2 out");
		jQuery("#submenu2").css("visibility","hidden");
	});
	
	jQuery("#tdchange3").bind("mouseover",function(){
		jQuery("#mFunction").val("3 in");
		jQuery("#submenu3").css("visibility","visible");
		
	});
	jQuery("#tdchange3").bind("mouseout",function(){
		jQuery("#mFunction").val("3 out");
		jQuery("#submenu3").css("visibility","hidden");
	});
})
</script>

</head>
<body>
<div id="container" style="position: fixed">
	<div class="Header_top">
		<table>
			<tr>
				<td><a id="tdchange" >menu1</a>
					<ul id="submenu1" style="position:relative;visibility:hidden; z-index:100";>
						<li>menu1 - li1</li>
				     	<li>menu1 - li2</li>
				     	<li>menu1 - li3</li>
				     	<li>menu1 - li4</li>
				     	<li>menu1 - li5</li>
				  	</ul>
				</td>
				<td><a id="tdchange2">menu2</a>
					<ul id="submenu2" style="position:relative;visibility:hidden; z-index:100";>
						<li>menu2 - li1</li>
				     	<li>menu2 - li2</li>
				     	<li>menu2 - li3</li>
				     	<li>menu2 - li4</li>
				     	<li>menu2 - li5</li>
				  	</ul>
				</td>
				<td><a id="tdchange3">menu3</a>
					<ul id="submenu3" style="position:relative;visibility:hidden; z-index:100";>
						<li>menu3 - li1</li>
				     	<li>menu3 - li2</li>
				     	<li>menu3 - li3</li>
				     	<li>menu3 - li4</li>
				     	<li>menu3 - li5</li>
				  	</ul>
				</td>
			</tr>
		</table>
		
	</div>
</div>

<div id="bodyer" >
<table>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr/>
	<tr>
		<td>
			<input value="mouseoverFunction _____ up" type="text" />
		</td>
	</tr>
	<tr>
		<td ><input type="text"  id="mFunction" value="mouseoverFunction" /></td>
	</tr>
</table>


		<table>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
			<tr>
				<td>body1</td>
			</tr>
		</table>
</div>
</body>
</html>