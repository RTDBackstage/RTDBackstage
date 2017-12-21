
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
						<td>`+item.sex+`</td>
						<td>`+item.phone+`</td>
						<td> `+item.email+`</td>
						<td>`+item.time+`</td>
						<td class="td-status"><span
							class="label label-success radius">已启用</span></td>
						<td class="td-manage">
						<a style="text-decoration:none" 
							onClick="member_stop(this,'10001')" href="javascript:;" title="停用">
							<i class="Hui-iconfont">&#xe631;</i>
						</a> 
						<a title="编辑" onclick="modifyMember(`+item.id+`)"
							class="ml-5" style="text-decoration:none">
							<i class="Hui-iconfont">&#xe6df;</i>
						</a> 
						<a title="删除" href="javascript:;" onclick="member_del(this,'1')"
							class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>`
				/*$("tbody").append(text)*/
						
			})
			
		}
	})
	
	$("#findByParam").click(()=>{
		
		var datas = {
			/*"timemin":$("#timemin").val(),
			"timemax":$("#timemax").val(),*/
			"nte":$("#name-tet-email").val()
		}
		
		$.ajax({
			url : URL +"account/findByParam/"+$("#timemin").val()+"&"+$("#timemax").val(),
			type:"get",
			contentType:"json",
			data:JSON.stringify(datas),
			success:function(data){
				$.each(data,(i,item)=>{
					var text = `<tr class="text-c">
							<td><input type="checkbox" value="1" name=""></td>
							<td>`+item.id+`</td>
							<td><u style="cursor:pointer" class="text-primary"
								onclick="member_show('张三','member-show.html','10001','360','400')">`+item.username+`</u></td>
							<td>`+item.password+`</td>
							<td>`+item.sex+`</td>
							<td>`+item.phone+`</td>
							<td> `+item.email+`</td>
							<td>`+item.time+`</td>
							<td class="td-status"><span
								class="label label-success radius">已启用</span></td>
							<td class="td-manage">
							<a style="text-decoration:none" 
								onClick="member_stop(this,'10001')" href="javascript:;" title="停用">
								<i class="Hui-iconfont">&#xe631;</i>
							</a> 
							<a title="编辑" onclick="modifyMember(`+item.id+`)"
								class="ml-5" style="text-decoration:none">
								<i class="Hui-iconfont">&#xe6df;</i>
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
	
})

function modifyMember(id){
	
	const URL ="http://localhost:8080/RTDBackstage/"
	
	$.ajax({
		url:URL +"account/modify/"+id,
		type:"get",
		contentType:"json",
		success:function(data){
			console.log("进入modify"+JSON.stringify(data))
			
			window.location.href="member-add.jsp"
		}
	})
	
}
