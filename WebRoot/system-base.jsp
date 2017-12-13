﻿<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
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
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 基本设置 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="Hui-article">
		<article class="cl pd-20">
			<form action="" method="post" class="form form-horizontal" id="form-article-add">
				<div id="tab-system" class="HuiTab">
					<div class="tabBar cl"><span>基本设置</span><span>安全设置</span><span>邮件设置</span><span>其他设置</span></div>
					<div class="tabCon">
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>网站名称：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-title" placeholder="控制在25个字、50个字节以内" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>关键词：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-Keywords" placeholder="5个左右,8汉字以内,用英文,隔开" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>描述：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-description" placeholder="空制在80个汉字，160个字符以内" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>css、js、images路径配置：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-static" placeholder="默认为空，为相对路径" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>上传目录配置：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-uploadfile" placeholder="默认为uploadfile" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2"><span class="c-red">*</span>底部版权信息：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-copyright" placeholder="&copy; 2014 H-ui.net" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">备案号：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="website-icp" placeholder="京ICP备00000000号" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">统计代码：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<textarea class="textarea"></textarea>
							</div>
						</div>
					</div>
					<div class="tabCon">
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">允许访问后台的IP列表：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<textarea class="textarea"></textarea>
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">后台登录失败最大次数：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="" value="5" class="input-text">
							</div>
						</div>
					</div>
					<div class="tabCon">
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">邮件发送模式：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">SMTP服务器：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">SMTP 端口：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="" value="25" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">邮箱帐号：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="email-name" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">邮箱密码：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="password" id="email-password" value="" class="input-text">
							</div>
						</div>
						<div class="row cl">
							<label class="form-label col-xs-4 col-sm-2">收件邮箱地址：</label>
							<div class="formControls col-xs-8 col-sm-9">
								<input type="text" id="email-address" value="" class="input-text">
							</div>
						</div>
					</div>
					<div class="tabCon"> </div>
				</div>
				<div class="row cl">
					<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
						<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存</button>
						<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					</div>
				</div>
			</form>
		</article>
	</div>
</section>

<!--_footer 作为公共模版分离出去--> 
<%@ include file="_footer.jsp" %>
<!--/_footer /作为公共模版分离出去--> 

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	$.Huitab("#tab-system .tabBar span","#tab-system .tabCon","current","click","0");
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>