<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script>

	const URL = "http://localhost:8080/RTDBackstage/"
$(()=>{
	
	$("dl").css("display","none");

	// 查询所有数据
		$.ajax({
			url : URL + "menu/index",
			type : "get",
			dataType : "json",
			success : function(data) {
					console.log(data)
					
					$.each(data,(i,item)=>{
						//将数据添加到ab标签，显示父菜单
						//$("dl")[i].style.display="block";
						$("dl").css("display","block")
						$("ab")[i].append(item.name)
					})
			}
		})
	
})

window.onload = function(){
	var fatherMenu = $(".Hui-aside #tree dl dt ab");
	//获取点击的名字-判断点击的下标
	for(i=0;i<fatherMenu.length;i++){
			//console.log("这是父节点的数量:"+fatherMenu.length);
			fatherMenu[i].index = i;
			/* fatherMenu[i].click(function(){
				console.log(this.innerHTML)
				alert(this.innerHTML)
			}) */
			fatherMenu[i].onclick=function(){
					$("li a").remove();
					var fathername = this.innerHTML;
					console.log("这是父节点名:"+fathername)
					$.ajax({
						url : URL +"menu/childMenuByFatherName/"+fathername,
						type:"get",
						dataType:"json",
						success:function(data){
						
							$.each(data,(i,item)=>{
								var childMenu = $(".Hui-aside #tree dl dd ul");
								console.log("这是子节点名:"+item.name)
								var text =`<li><a href="`+item.url+`" title="`+item.name+`">`+item.name+`</a></li>`
								childMenu.append(text)
							})
						}
					})
			}
		}
}
	
</script>

<aside class="Hui-aside">
	<div class="menu_dropdown bk_2" id="tree">
		 <dl id="menu-article">
			<dt>
				<i class="Hui-iconfont">&#xe616;</i>
				<ab style="padding:15px"></ab>
				<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i>
			</dt>
			<dd>
				<ul id="li1">
					<li >
						<!-- <a href="article-list.jsp" title="资讯管理">资讯管理</a> -->
					</li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-picture">
			<dt>
				<i class="Hui-iconfont">&#xe613;</i>
				<ab style="padding:15px"></ab>
				<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li2">
					<li >
					<!-- <a href="picture-list.jsp" title="图片管理">图片管理</a> -->
					
					</li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i><ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li3">
					<li> </li>
					<!-- <li><a href="product-brand.jsp" title="品牌管理">品牌管理</a></li>
					<li><a href="product-category.jsp" title="分类管理">分类管理</a></li>
					<li><a href="product-list.jsp" title="产品管理">产品管理</a></li> -->
				</ul>
			</dd>
		</dl>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i><ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li3">
					<li> </li>
					<!-- <li><a href="http://h-ui.duoshuo.com/admin/" title="评论列表">评论列表</a></li>
					<li><a href="feedback-list.jsp" title="意见反馈">意见反馈</a></li> -->
				</ul>
			</dd>
		</dl>
		<dl id="menu-member">
			<dt><i class="Hui-iconfont">&#xe60d;</i><ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li4">
				    <li> </li>
					<!-- <li><a href="member-list.jsp" title="会员列表">会员列表</a></li>
					<li><a href="member-del.jsp" title="删除的会员">删除的会员</a></li>
					<li><a href="member-level.jsp" title="等级管理">等级管理</a></li>
					<li><a href="member-scoreoperation.jsp" title="积分管理">积分管理</a></li>
					<li><a href="member-record-browse.jsp" title="浏览记录">浏览记录</a></li>
					<li><a href="member-record-download.jsp" title="下载记录">下载记录</a></li>
					<li><a href="member-record-share.jsp" title="分享记录">分享记录</a></li> -->
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i><ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li5"> 
					<li> </li>
					<!-- <li><a href="admin-role.jsp" title="角色管理">角色管理</a></li>
					<li><a href="admin-permission.jsp" title="权限管理">权限管理</a></li>
					<li><a href="admin-list.jsp" title="管理员列表">管理员列表</a></li> -->
				</ul>
			</dd>
		</dl>
		<dl id="menu-tongji">
			<dt><i class="Hui-iconfont">&#xe61a;</i> <ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li6">
					<li> </li>
					<!-- <li><a href="charts-1.jsp" title="折线图">折线图</a></li>
					<li><a href="charts-2.jsp" title="时间轴折线图">时间轴折线图</a></li>
					<li><a href="charts-3.jsp" title="区域图">区域图</a></li>
					<li><a href="charts-4.jsp" title="柱状图">柱状图</a></li>
					<li><a href="charts-5.jsp" title="饼状图">饼状图</a></li>
					<li><a href="charts-6.jsp" title="3D柱状图">3D柱状图</a></li>
					<li><a href="charts-7.jsp" title="3D饼状图">3D饼状图</a></li> -->
				</ul>
			</dd>
		</dl>
		<dl id="menu-system">
			<dt><i class="Hui-iconfont">&#xe62e;</i> <ab style="padding:15px"></ab>
			<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul id="li7">
					<li> </li>
					<!-- <li><a href="system-base.jsp" title="系统设置">系统设置</a></li>
					<li><a href="system-category.jsp" title="栏目管理">栏目管理</a></li>
					<li><a href="system-data.jsp" title="数据字典">数据字典</a></li>
					<li><a href="system-shielding.jsp" title="屏蔽词">屏蔽词</a></li>
					<li><a href="system-log.jsp" title="系统日志">系统日志</a></li> -->
				</ul>
			</dd>
		</dl>
		
	</div>
</aside>
<div class="dislpayArrow hidden-xs">
	<a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
</div>