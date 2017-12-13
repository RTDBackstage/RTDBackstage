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
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 系统管理 <span class="c-gray en">&gt;</span> 栏目管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="pd-20">
		<form action="" method="post" class="form form-horizontal" id="form-category-add">
			<div id="tab-category" class="HuiTab">
				<div class="tabBar cl"><span>基本设置</span><span>模版设置</span><span>SEO</span></div>
				<div class="tabCon">
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">栏目ID：</label>
						<div class="formControls col-xs-8 col-sm-9">11230</div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>上级栏目：</label>
						<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
							<select class="select" id="sel_Sub" name="sel_Sub" onchange="SetSubID(this);">
								<option value="0">顶级分类</option>
								<option value="10">分类一级</option>
								<option value="101">&nbsp;&nbsp;├ 分类二级</option>
								<option value="102">&nbsp;&nbsp;├ 分类二级</option>
								<option value="20">分类一级</option>
								<option value="200">&nbsp;&nbsp;├ 分类二级</option>
							</select>
							</span> </div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>分类名称：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" placeholder="" id="" name="">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">别名：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" placeholder="" id="" name="">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">目录：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" placeholder="" id="" name="">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">内容类型：</label>
						<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
							<select name="" class="select">
								<option value="1">文章</option>
								<option value="2">图片</option>
								<option value="3">商品</option>
								<option value="4">视频</option>
								<option value="5">专题</option>
								<option value="6">链接</option>
							</select>
							</span> </div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">是否生成静态html：</label>
						<div class="formControls col-xs-8 col-sm-9 skin-minimal">
							<div class="check-box">
								<input type="checkbox" id="checkbox-pinglun">
								<label for="checkbox-pinglun">&nbsp;</label>
							</div>
						</div>
						<div class="col-3"> </div>
					</div>
				</div>
				<div class="tabCon">
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">首页模版：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" style="width:200px;">
							<input type="button" class="btn btn-default" value="浏览">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">列表页模版：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" style="width:200px;">
							<input type="button" class="btn btn-default" value="浏览">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">详情页模版：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="" style="width:200px;">
							<input type="button" class="btn btn-default" value="浏览">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">详细页存储规则：</label>
						<div class="formControls col-xs-8 col-sm-9"> <span class="select-box">
							<select class="select" id="" name="">
								<option value="1">按年度划子目录</option>
								<option value="2">按年/月划分子目录</option>
								<option value="3">按年/月/日划分子目录</option>
							</select>
							</span> </div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">每页显示多少条：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="20" style="width:200px;">
						</div>
						<div class="col-3"> </div>
					</div>
				</div>
				<div class="tabCon">
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">首页文件名：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="index.html" style="width:200px;">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">关键词：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" value="">
						</div>
						<div class="col-3"> </div>
					</div>
					<div class="row cl">
						<label class="form-label col-xs-4 col-sm-3">描述：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<textarea name="" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength(this,100)"></textarea>
							<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
						</div>
						<div class="col-3"> </div>
					</div>
				</div>
			</div>
			<div class="row cl">
				<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
					<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
				</div>
			</div>
		</form>
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

	$.Huitab("#tab-category .tabBar span","#tab-category .tabCon","current","click","0");
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>