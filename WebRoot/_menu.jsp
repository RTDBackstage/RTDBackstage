<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script>
	const URL = "http://localhost:8080/RTDBackstage/"
	
	$(() => {
		// 查询所有数据
		$.ajax({
			url : URL + "menu/topMenu",
			type : "get",
			dataType : "json",
			success : function(data) {
					console.log(data)
					$.each(data,(i,item)=>{
			var text = `
				<dl id="menuselect">
					<dt class="select">
						<i class="Hui-iconfont">&#xe613;</i> `+item.name+`
						<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
					</dt>
					<dd style="display:block;">
						<ul>
							<li><a href="picture-list.jsp" title="图片管理">图片管理</a></li>
						</ul>
					</dd>
				</dl>
						`
						
						$("#tree").append(text)
					})
				}
		})
	})
	
	/* $("dt").click(function(){
		$(this).addClass('selected');
		$("dd").show();
	}) */
	
</script>

<aside class="Hui-aside">
	<div class="menu_dropdown bk_2" id="tree">
		 <dl id="menu-article">
			<dt >
				<i class="Hui-iconfont">&#xe616;</i> 资讯管理sdfj
				<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd >
				<ul>
					<li><a href="article-list.jsp" title="资讯管理">资讯管理</a></li>
				</ul>
			</dd>
		</dl> 
		
	</div>
</aside>
<div class="dislpayArrow hidden-xs">
<a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>