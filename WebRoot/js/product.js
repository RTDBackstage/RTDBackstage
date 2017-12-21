$(()=>{
	
		var t = $("#treeDemo");
		t = $.fn.zTree.init(t, setting, zNodes);
		var zTree = $.fn.zTree.getZTreeObj("tree");
		/* zTree.selectNode(zTree.getNodeByParam("id",'11')); */
		$.ajax({
			url:URL+"fund/findAll",
			type:"get",
			dataType:"json",
			success:function(data){
				$.each(data,(i,item)=>{
					var text =`<tr class="text-c va-m">
								<td><input name="" type="checkbox" value=""></td>
								<td>`+item.id+`</td>
								<td><a onClick="product_show('哥本哈根橡木地板','product-show.jsp','10001')" href="javascript:;"><img width="60" class="product-thumb" src="pic/product/Thumb/6204.jpg"></a></td>
								<td class="text-l"><a style="text-decoration:none" onClick="product_show('哥本哈根橡木地板','product-show.jsp','10001')" href="javascript:;"><img title="国内品牌" src="static/h-ui/images/gq/cn.gif"> <b class="text-success">圣象</b> 哥本哈根橡木地板KS8373</a></td>
								<td class="text-l">原木的外在,实木条形结构,色泽花纹自然,写意;款式设计吸取实木地板的天然去雕饰之美,在视觉上给人带来深邃联想.多款产品适合搭配不同的风格的室内装饰;功能流露出尊贵典雅的大气韵味。</td>
								<td><span class="price">356.0</span> 元/平米</td>
								<td class="td-status"><span class="label label-success radius">已发布</span></td>
								<td class="td-manage"><a style="text-decoration:none" onClick="product_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_edit('产品编辑','product-add.jsp','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
							</tr>`
					$("#product").apend(text)
				})
				
			}
		});
		
		$(document).ready(function(){
			var t = $("#treeDemo");
			t = $.fn.zTree.init(t, setting, zNodes);
			var zTree = $.fn.zTree.getZTreeObj("tree");
			/* zTree.selectNode(zTree.getNodeByParam("id",'11')); */
			$.ajax({
				url:URL+"fund/findAll",
				type:"get",
				dataType:"json",
				success:function(data){
					$.each(data,(i,item)=>{
						var text =``
						$("#product").apend(text)
					})
					
				}
			});
			
		});
		
})