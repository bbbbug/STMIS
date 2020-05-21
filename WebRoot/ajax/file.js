var ip = "http://127.0.0.1:8080/STMIS/";
$(function() {
	$('#addImport').click(function() {
		openFileDialogue();
	});
});

/**
 * 打开上传文件对话框
 */
function openFileDialogue() {
	var f = document.getElementById('FileUpload');
	f.click();
}

/**
 * 文件上传 前检查与确认
 */
var msg;
function uploadWord() {
	var fileObj = document.getElementById("FileUpload").files[0]; // js 获取文件对象
	var fileObjName = $("#FileUpload").val();
	if (typeof (fileObj) == "undefined" || fileObj.size <= 0) {
		alert("请选择要导入的文档?");
		return;
	}
	//判断是否为 doc 或 docx 文件
	var fileName = getFileName(fileObjName);
	console.log("已上传的文件名:" + fileName);
	$("#filename").text(fileName);
	/*var fileSuffix = getFileSuffix(fileObjName);
	if (fileSuffix != 'doc' && fileSuffix != 'docx') {
	    alert("----请选择正确的文件格式---------");
	    return;
	} */
	//确认是否上传(略)
	//执行上传
	uploadWordDo(fileObj, fileName);

}

/**
 * 发送ajax请求 执行上传
 */
function uploadWordDo(fileObj) {
	var formFile = new FormData();
	formFile.append("file", fileObj); //加入文件对象
	formFile.append("basePath", ""); //加入文件对象
	var data = formFile;
	$.ajax({
		url : ip+"course/upload/do",
		data : data,
		type : "post",
		dataType : "json",
		async : true,
		cache : false,
		processData : false, //用于对data参数进行序列化处理 这里必须false
		contentType : false, //必须
		success : function(result) {
			//成功提示
			console.log(result);
			var code = result.code;
			if (code == '100') {
				alert("--上传成功---");
				$("#reco #PXZL").val(result.extend.path);
			} else {
				alert("--失败---");
			}

		}
	});

}
/**
 * 获取文件名
 * @param file
 * @returns {*}
 */
function getFileName(file) {
	var arr = file.split('\\');
	return arr[arr.length - 1];
}

/**
 * 获取后缀
 * @param file
 * @returns {string}
 */
function getFileSuffix(file) {
	var point = file.lastIndexOf(".");
	var type = file.substr(point + 1);
	return type;
}




//	    

$(function() {
	$('#addImporttemplate').click(function() {
		openFileDialogue1();
	});
});

//打开上传文件对话框

function openFileDialogue1() {
	var f = document.getElementById('templateUpload');
	f.click();
}

// 文件上传 前检查与确认

var msg1;
function uploadTemplate() {
	var fileObj1 = document.getElementById("templateUpload").files[0]; // js 获取文件对象
	var fileObjName1 = $("#templateUpload").val();
	if (typeof (fileObj1) == "undefined" || fileObj1.size <= 0) {
		alert("请选择要导入的文档?");
		return;
	}
	//判断是否为 doc 或 docx 文件
	var fileName1 = getFileName(fileObjName1);

	/* var fileSuffix = getFileSuffix(fileObjName1);
	 if (fileSuffix != 'doc' && fileSuffix != 'docx') {
	     alert("----请选择正确的文件格式---------");
	     return;
	 } */
	//确认是否上传(略)
	//执行上传
	uploadWordDo1(fileObj1);

}

function uploadWordDo1(fileObj1) {
	var formFile1 = new FormData();
	formFile1.append("file", fileObj1); //加入文件对象
	formFile1.append("basePath", ""); //加入文件对象
	var data1 = formFile1;
	$.ajax({
		url : ip+"course/addCourseFeedbackQuestion",
		data : data1,
		type : "post",
		dataType : "json",
		async : true,
		cache : false,
		processData : false, //用于对data参数进行序列化处理 这里必须false
		contentType : false, //必须
		success : function(result) {
			//成功提示
			console.log(result);
			var code = result.code;
			if (code == '100') {
				alert("--上传成功---");
			} else {
				alert("--失败---");
			}
		}
	});
}