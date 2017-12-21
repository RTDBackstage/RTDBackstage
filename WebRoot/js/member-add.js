$(()=>{
	
	const URL ="http://localhost:8080/RTDBackstage/"
		
	$("#btnAdd").click(()=>{
		
		var data ={
			"username":$("#username").val(),
			"password":$("#password").val(),
			"phone":$("#phone").val(),
			"email":$("#email").val(),
			"name":$("#name").val(),
			"card":$("#card").val(),
			"sex":$('input[name="sex"]:checked').val(),
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
		
		console.log("进入add"+JSON.stringify(data))
		
		$.ajax({
			url:URL +"account/add",
			type:"post",
			contentType: "application/json",
			data: JSON.stringify(data),
			success:function(ints){
				console.log("进入controller"+ints)
				window.location.href="member-list.jsp"
			}
		})
	})
	


//修改用户
})
function btnModify(id){
	const URL ="http://localhost:8080/RTDBackstage/"
	var data ={
			"username":$("#username").val(),
			"password":$("#password").val(),
			"phone":$("#phone").val(),
			"email":$("#email").val(),
			"name":$("#name").val(),
			"card":$("#card").val(),
			"sex":$('input[name="sex"]:checked').val(),
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
	
	console.log("进入add"+JSON.stringify(data))
	
	$.ajax({
		url:URL +"account/modify/"+id,
		type:"put",
		contentType: "application/json",
		data: JSON.stringify(data),
		success:function(ints){
			console.log("进入controller.."+ints)
			if(ints ==0){
				window.confirm("修改失败，请重新修改")
				window.location.reload();
			}
			window.location.href="member-list.jsp"
		}
	})
}