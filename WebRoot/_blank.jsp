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
	<nav class="breadcrumb"><i class="Hui-iconfont"></i> <a href="/" class="maincolor">首页</a> <span class="c-999 en">&gt;</span><span class="c-666">空白页</span></nav>
	<div class="Hui-article">
		<article class="cl pd-20">
			这是个空白页，请在此处加入您的代码！
		</article>
	</div>
</section>

<!--_footer 作为公共模版分离出去-->
<%@ include file="_footer.jsp" %>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript">

</script>
<script type="text/javascript" src="js/index.js"/>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>