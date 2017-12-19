
$(()=>{
	const URL ="http://localhost:8080/RTDBackstage/"
	$.ajax({
		url:URL +"account/find",
		type:"get",
		dataType:"json",
		success:function(data){
			$.each(data,(i,item)=>{
				var text = `<tr class="text-c">
						<td><input type="checkbox" value="1" name=""></td>
						<td>`+item.id+`</td>
						<td><u style="cursor:pointer" class="text-primary"
							onclick="member_show('张三','member-show.html','10001','360','400')">`+item.username+`</u></td>
						<td>`+item.password+`</td>
						<td>`+item.phone+`</td>
						<td>`+item.sex+`</td>
						<td> `+item.age+`</td>
						<td>`+item.photo+`</td>
						<td class="td-status"><span
							class="label label-success radius">已启用</span></td>
						<td class="td-manage">
						<a style="text-decoration:none" 
							onClick="member_stop(this,'10001')" href="javascript:;" title="停用">
							<i class="Hui-iconfont">&#xe631;</i>
						</a> 
						<a title="编辑" href="member-add.jsp" 
							class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<a style="text-decoration:none" class="ml-5"
							onClick="change_password('修改密码','change-password.html','10001','600','270')"href="javascript:;" title="修改密码">
							<i class="Hui-iconfont">&#xe63f;</i>
						</a>
						<a title="删除" href="javascript:;" onclick="member_del(this,'1')"
							class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>`
				$("tbody").append(text)
			})
			
		}
	})
})