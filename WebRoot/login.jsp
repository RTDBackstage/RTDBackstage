<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--/meta 作为公共模版分离出去-->
<%@ include file="_meta.jsp" %>
<!--/meta 作为公共模版分离出去-->

<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header"></div>
<div class="loginWraper">
	<div id="loginform" class="loginBox">
		<div class="form form-horizontal" >
			<div class="row cl">
				<label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
				<div class="formControls col-xs-8">
					<input id="account" name="" type="account" placeholder="账户" class="input-text size-L">
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-3">
				<i class="Hui-iconfont">&#xe60e;</i></label>
				<div class="formControls col-xs-8">
					<input id="password" name="" type="password" placeholder="密码" class="input-text size-L">
				</div>
			</div>
			<div class="row cl">
				<div class="formControls col-xs-8 col-xs-offset-3">
					<input class="input-text size-L" type="text" placeholder="验证码" onblur="if(this.value==''){this.value='验证码:'}" onclick="if(this.value=='验证码:'){this.value='';}" value="验证码:" style="width:150px;">
					<img src="images/VerifyCode.aspx.png">
					<a id="kanbuq" href="javascript:;">看不清，换一张</a>
				</div>
			</div>
			<!-- <div class="row cl">
				<div class="formControls col-xs-8 col-xs-offset-3">
					<label for="online">
						<input type="checkbox" name="online" id="online" value="">
						使我保持登录状态</label>
				</div>
			</div> -->
			<div class="row cl">
				<div class="formControls col-xs-8 col-xs-offset-3">
					<button id="btnlogin" type="button" class="btn btn-success radius size-L">&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;</button>
					<button id="btnreset" class="btn btn-default radius size-L">&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;</button>
					<!-- <input id="btnlogin" type="button" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
					<input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;"> -->
				</div>
			</div>
		</div>
	</div>
</div>
<div class="footer">Copyright 你的公司名称 by H-ui.admin.page.v3.0</div>

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script>
<script>
	const URL = "http://localhost:8080/RTDBackstage/"

	$("#btnlogin").click(()=>{
		/* var data = {
			"account":$("#account").val(),
			"password":$("#password").val(),
		} */
		console.log("点击登陆按钮"+$("#account").val()+".."+$("#password").val())
		$.ajax({
			url:URL + "account/login/"+$("#account").val()+"&"+$("#password").val(),
			type:"get",
			async : true,
			dataType:"json",
			success:function(data){
				
				console.log(data)
				if(data =="登陆成功"){
					window.alert(data)
					window.location.href="index.jsp"
				}else if(data == "登陆失败，请重新登陆"){
					window.alert(data)
					window.location.href="login.jsp"
				}
				
				
			}
			
		})
	})




var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();

</script>
</body>
</html>