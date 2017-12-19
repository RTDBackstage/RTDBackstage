$(()=>{
	
	const URL ="localhost:8080/RDTBackstage/"
		
	$("#btnadd").click(()=>{
		
		var data ={
			"username":$("#username").val(),
			"password":$("#password").val(),
			"phone":$("#phone").val(),
			"email":$("#email").val(),
			"name":$("#name").val(),
			"card":$("#card").val(),
			"sex":$("#sex").val(),
			"age":$("#age").val(),
			"photo":$("#photo").val(),
			"remaining":$("#remaining").val(),
			"askcode":$("#askcode").val(),
			"asknum":$("#asknum").val(),
			"paynum":$("#paynum").val(),
			"asksum":$("#asksum").val(),
			"question1":$("#question1").val(),
			"answer1":$("#answer1").val(),
			"question2":$("#question2").val(),
			"answer2":$("#answer2").val(),
			"question3":$("#question3").val(),
			"answer3":$("#answer3").val(),
		}
		
		console.log("进入add"+data.tostring())
		
		$.ajax({
			url:URL+"account/add",
			type:"post",
			contentType:"Application/json",
			data:JSON.stringify(data),
			success:()=>{
				window.location.href("member-list.jsp")
			}
			
			
		})
		
		
	})
})