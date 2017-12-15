<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--/meta 作为公共模版分离出去-->
<%@ include file="_meta.jsp" %>
<!--/meta 作为公共模版分离出去-->

<body>
<!--_header 作为公共模版分离出去-->
<%@ include file="_header.jsp" %>
<!--/_header 作为公共模版分离出去-->

<!--_menu 作为公共模版分离出去-->
<%@ include file="_menu.jsp" %>
<!--/_menu 作为公共模版分离出去-->

<section class="Hui-article-box">
	<nav class="breadcrumb">
	<i class="Hui-iconfont"></i> <a href="/" class="maincolor">首页</a> 
		<span class="c-999 en">&gt;</span>
		<span class="c-666">我的桌面</span> 
		<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="Hui-article">
		<article class="cl pd-20">
			<p class="f-20 text-success">欢迎使用H-ui.admin
				<span class="f-14">v2.3</span>
				后台模版！</p>
			<p>登录次数：18 </p>
			<p>上次登录IP：222.35.131.79.1  上次登录时间：2014-6-14 11:19:55</p>
			<table class="table table-border table-bordered table-bg">
				<thead>
					<tr>
						<th colspan="7" scope="col">信息统计</th>
			</tr>
					<tr class="text-c">
						<th>统计</th>
						<th>资讯库</th>
						<th>图片库</th>
						<th>产品库</th>
						<th>用户</th>
						<th>管理员</th>
			</tr>
		</thead>
				<tbody>
					<tr class="text-c">
						<td>总数</td>
						<td>92</td>
						<td>9</td>
						<td>0</td>
						<td>8</td>
						<td>20</td>
			</tr>
					<tr class="text-c">
						<td>今日</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
			</tr>
					<tr class="text-c">
						<td>昨日</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
			</tr>
					<tr class="text-c">
						<td>本周</td>
						<td>2</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
			</tr>
					<tr class="text-c">
						<td>本月</td>
						<td>2</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
			</tr>
		</tbody>
	</table>
			<table class="table table-border table-bordered table-bg mt-20">
				<thead>
					<tr>
						<th colspan="2" scope="col">服务器信息</th>
			</tr>
		</thead>
				<tbody>
					<tr>
						<th width="30%">服务器计算机名</th>
						<td><span id="lbServerName">http://127.0.0.1/</span></td>
			</tr>
					<tr>
						<td>服务器IP地址</td>
						<td>192.168.1.1</td>
			</tr>
					<tr>
						<td>服务器域名</td>
						<td>www.h-ui.net</td>
			</tr>
					<tr>
						<td>服务器端口 </td>
						<td>80</td>
			</tr>
					<tr>
						<td>服务器IIS版本 </td>
						<td>Microsoft-IIS/6.0</td>
			</tr>
					<tr>
						<td>本文件所在文件夹 </td>
						<td>D:\WebSite\HanXiPuTai.com\XinYiCMS.Web\</td>
			</tr>
					<tr>
						<td>服务器操作系统 </td>
						<td>Microsoft Windows NT 5.2.3790 Service Pack 2</td>
			</tr>
					<tr>
						<td>系统所在文件夹 </td>
						<td>C:\WINDOWS\system32</td>
			</tr>
					<tr>
						<td>服务器脚本超时时间 </td>
						<td>30000秒</td>
			</tr>
					<tr>
						<td>服务器的语言种类 </td>
						<td>Chinese (People's Republic of China)</td>
			</tr>
					<tr>
						<td>.NET Framework 版本 </td>
						<td>2.050727.3655</td>
			</tr>
					<tr>
						<td>服务器当前时间 </td>
						<td>2014-6-14 12:06:23</td>
			</tr>
					<tr>
						<td>服务器IE版本 </td>
						<td>6.0000</td>
			</tr>
					<tr>
						<td>服务器上次启动到现在已运行 </td>
						<td>7210分钟</td>
			</tr>
					<tr>
						<td>逻辑驱动器 </td>
						<td>C:\D:\</td>
			</tr>
					<tr>
						<td>CPU 总数 </td>
						<td>4</td>
			</tr>
					<tr>
						<td>CPU 类型 </td>
						<td>x86 Family 6 Model 42 Stepping 1, GenuineIntel</td>
			</tr>
					<tr>
						<td>虚拟内存 </td>
						<td>52480M</td>
			</tr>
					<tr>
						<td>当前程序占用内存 </td>
						<td>3.29M</td>
			</tr>
					<tr>
						<td>Asp.net所占内存 </td>
						<td>51.46M</td>
			</tr>
					<tr>
						<td>当前Session数量 </td>
						<td>8</td>
			</tr>
					<tr>
						<td>当前SessionID </td>
						<td>gznhpwmp34004345jz2q3l45</td>
			</tr>
					<tr>
						<td>当前系统用户名 </td>
						<td>NETWORK SERVICE</td>
			</tr>
		</tbody>
	</table>
</article>
		<footer class="footer">
			<p>感谢jQuery、layer、laypage、Validform、UEditor、My97DatePicker、iconfont、Datatables、WebUploaded、icheck、highcharts、bootstrap-Switch<br> Copyright &copy;2015 H-ui.admin v3.0 All Rights Reserved.<br> 本后台系统由<a href="http://www.h-ui.net/" target="_blank" title="H-ui前端框架">H-ui前端框架</a>提供前端技术支持</p>
</footer>
</div>
</section>

<!--_footer 作为公共模版分离出去-->
<%@ include file="_footer.jsp" %>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="js/index.js"/>
<!--/请在上方写此页面业务相关的脚本-->

</body>
</html>