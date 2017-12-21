$(() => {
	
		const URL = "http://localhost:8080/RTDBackstage/"
		//$("dl").style.display="none";
		$("dl").css("display","none");
		
		// 查询所有数据
		$.ajax({
			url : URL + "menu/index",
			type : "get",
			dataType : "json",
			success : function(data) {
					console.log(data)
					
					$.each(data,(i,item)=>{
						//将数据添加到ab标签，显示父菜单
						$("dl")[i].style.display="block";
						$("ab")[i].append(item.name);
						//$("a")[i].append(item.childName);
						
						
					})
				}
		})
		
		var fatherMenu = $(".Hui-aside #tree dl dt");
		for(i=0;i<fatherMenu.length;i++){
			
			fatheMenu[i].click(()=>{
				var fatherMenu = $(".Hui-aside #tree dl dt ab").html()
				
				console.log("这是点击的值:"+fatherMenu)
				
				$.ajax({
					url : URL +"menu/childMenuByFatherName/"+fatherMenu,
					type:"get",
					dataType:"json",
					success:function(data){
						$.each(data,(i,item)=>{
							console.log(JSON.stringify(data))					
							$(".Hui-aside #tree dl dd ul li").append(`<a href="`+item.url+`" title="资讯管理">`+item.name+`</a>`)
						})
					}
				})
			})
		}
		
})
	
