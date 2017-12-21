
$(()=>{
	
	const URL ="http://localhost:8080/RTDBackstage/"
		
	$.ajax({
		url: URL +"menu/findLevel",
		type:"get",
		dataType:"json",
		success:function(data){
			$.each(data,(i,item)=>{
				var text = `<tr class="text-c">
								<td><input type="checkbox" value="1" name=""></td>
								<td>1</td>
								<td>张三</u></td>
								<td>经理</td>
								<td>资讯管理 会员管理 系统管理</td>
								<td>管理</td>
								<!-- <td> 在职</td> -->
								<td class="td-status"><span
									class="label label-danger radius">已删除</span></td>
								<td class="td-manage">
									<a style="text-decoration:none"
										onClick="member_stop(this,'10001')" href="javascript:;"
										title="停用"> 
										<i class="Hui-iconfont">&#xe631;</i>
									</a> 
									<a title="编辑" onclick="modifyMember(${a.id})" class="ml-5"
										style="text-decoration:none"> 
										<i class="Hui-iconfont">&#xe6df;</i>
									</a> 
									<a style="text-decoration:none" class="ml-5"
										onClick="change_password('修改密码','change-password.html','10001','600','270')"
										href="javascript:;" title="修改密码"> <i class="Hui-iconfont">&#xe63f;</i></a>
									<a title="删除" href="javascript:;"、onclick="member_del(this,'1')" class="ml-5"
										style="text-decoration:none"> 
										<i class="Hui-iconfont">&#xe6e2;</i>
									</a>
								</td>
							</tr>`
							
					$("tbody").append(text)
				
			})
		}
	})
	
})
