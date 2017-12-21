<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!--/meta 作为公共模版分离出去-->
<%@ include file="_meta.jsp"%>
<!--/meta 作为公共模版分离出去-->

<body>
	<article class="cl pd-20">
	<form  class="form form-horizontal"
		id="form-member-add"> 
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>用户名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.username }" placeholder=""
					id="username" name="username">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.password}" placeholder=""
					id="password" name="password">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>性别：</label>
			<div class="formControls col-xs-8 col-sm-9 skin-minimal">
				
				<div class="radio-box">
					<input name="sex" type="radio" id="sex" value="男" ${modifyaccount.sex=='男'?'checked':''}> <label
						for="sex-1">男</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="sex" name="sex" value="女 " ${modifyaccount.sex=='女'?'checked':''}> <label
						for="sex-2">女</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="sex" name="sex" value="保密" ${modifyaccount.sex=='保密'?'checked':''}> <label
						for="sex-3">保密</label>
				</div>
				
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>年龄：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.age}" placeholder=""
					id="age" name="age">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>手机：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.phone}" placeholder=""
					id="phone" name="phone">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>邮箱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="@" value="${modifyaccount.email}"
				name="email" id="email">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>真实姓名：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.name}" placeholder=""
					id="name" name="name">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">头像：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<span class="btn-upload form-group"> 
				<input
					class="input-text upload-url" type="text" name="uploadfile"
					id="photo" value="${modifyaccount.photo}" readonly nullmsg="请添加附件！" style="width:200px">
					<a href="javascript:void();" class="btn btn-primary radius upload-btn">
					<i class="Hui-iconfont">&#xe642;</i> 浏览文件</a> 
				<input type="file" multiple name="file-2" class="input-file">
				</span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>身份证：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.card}" placeholder=""
					id="card" name="card">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>余额：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.remaining}" placeholder=""
					id="remaining" name="remaining">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>邀请码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.askcode}" placeholder=""
					id="askcode" name="askcode">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>邀请累计：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.asksum}" placeholder=""
					id="asksum" name="asksum">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>支付密码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.paynum}" placeholder=""
					id="paynum" name="paynum">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保问题1：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.question1}" placeholder=""
					id="question1" name="question1">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保答案1：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.answer1}" placeholder=""
					id="answer1" name="answer1">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保问题2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.question2}" placeholder=""
					id="question2" name="question2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保答案2：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.answer2}" placeholder=""
					id="answer2" name="answer2">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保问题3：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.question3}" placeholder=""
					id="question3" name="question3">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span
				class="c-red">*</span>密保答案3：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${modifyaccount.answer3}" placeholder=""
					id="answer3" name="answer3">
			</div>
		</div>
		
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<button id="btnAdd" class="btn btn-primary radius" style="display:${modifyaccount.id==null?'block':'none'};" type="button">&nbsp;&nbsp;提交&nbsp;&nbsp;</button>
				<%-- <button id="btnModify" onclick="btnModify(${modifyaccount.id})" class="btn btn-primary radius" style="display:${modifyaccount.id==null?'none':'block'};"  type="button">&nbsp;&nbsp;修改&nbsp;&nbsp;</button> --%>
				<input onclick="btnModify(${modifyaccount.id})" style="display:${modifyaccount.id==null?'none':'block'};" class="btn btn-primary radius" type="button" value="&nbsp;&nbsp;修改&nbsp;&nbsp;">
			</div>
		</div>
	</form>
	</article>

	<!--_footer 作为公共模版分离出去-->
<%@ include file="_footer.jsp" %>
	<!--/_footer /作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script src="js/member-add.js"/>
	
	<script type="text/javascript"
		src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
	
			$("#form-member-add").validate({
				rules : {
					username : {
						required : true,
						minlength : 2,
						maxlength : 16
					},
					sex : {
						required : true,
					},
					mobile : {
						required : true,
						isMobile : true,
					},
					email : {
						required : true,
						email : true,
					},
					uploadfile : {
						required : true,
					},
				},
				onkeyup : false,
				focusCleanup : true,
				success : "valid",
				submitHandler : function(form) {
					$(form).ajaxSubmit();
					var index = parent.layer.getFrameIndex(window.name);
					parent.$('.btn-refresh').click();
					parent.layer.close(index);
				}
			});
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>