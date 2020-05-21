/**
 * 分页管理
 */
$(function(){		
	//绑定下拉列表改变事件
	//权限管理
	var pageInfo_id_m=$("#manager_pageInfo ul li");
	pageInfo_id_m.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllManager(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_m.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_m.find("select option:selected").val();
		getAllManager(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_m.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_m.find("select option:selected").val();
		var pageNum=pageInfo_id_m.find("#pageNum").text();//总页数
		getAllManager(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});
	
	//员工管理
	var pageInfo_id_e=$("#employee_pageInfo ul li");
	pageInfo_id_e.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllEmployee(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_e.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_e.find("select option:selected").val();
		getAllEmployee(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_e.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_e.find("select option:selected").val();
		var pageNum=pageInfo_id_e.find("#pageNum").text();//总页数
		console.log(pageCurrentNum);
		getAllEmployee(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});
	
	//教师管理
	var pageInfo_id_t=$("#teacher_pageInfo ul li");
	pageInfo_id_t.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllTeacher(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_t.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_t.find("select option:selected").val();
		getAllTeacher(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_t.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_t.find("select option:selected").val();
		var pageNum=pageInfo_id_t.find("#pageNum").text();//总页数
		getAllTeacher(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});
	
	//课程类别管理
	var pageInfo_id_c=$("#category_pageInfo ul li");
	pageInfo_id_c.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllCategory(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_c.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_c.find("select option:selected").val();
		getAllCategory(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_c.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_c.find("select option:selected").val();
		var pageNum=pageInfo_id_c.find("#pageNum").text();//总页数
		getAllCategory(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});
		
	//课程管理
	var pageInfo_id_co=$("#course_pageInfo ul li");
	pageInfo_id_co.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllCourse(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_co.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_co.find("select option:selected").val();
		getAllCourse(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_co.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_co.find("select option:selected").val();
		var pageNum=pageInfo_id_co.find("#pageNum").text();//总页数
		getAllCourse(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});	
	
	//资料审核
	var pageInfo_id_cr=$("#courseResource_pageInfo ul li");
	pageInfo_id_cr.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllResource(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_cr.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_cr.find("select option:selected").val();
		getAllResource(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_cr.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_cr.find("select option:selected").val();
		var pageNum=pageInfo_id_cr.find("#pageNum").text();//总页数
		getAllResource(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});	
	
	//员工成绩employeeCredit
	var pageInfo_id_ec=$("#courseSelection_pageInfo ul li");
	pageInfo_id_ec.find("select").on("change",function(){
		var pageCurrentNum=this.value;//获取当前点击的页数
		//alert(pageCurrentNum);
		getAllCourseSelection(pageCurrentNum);
	});
	//向前翻页
	pageInfo_id_ec.find("#previousPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_ec.find("select option:selected").val();
		getAllCourseSelection(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
	});
	//向后翻页
	pageInfo_id_ec.find("#nextPage").on("click",function(){
		var pageCurrentNum=pageInfo_id_ec.find("select option:selected").val();
		var pageNum=pageInfo_id_ec.find("#pageNum").text();//总页数
		getAllCourseSelection(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
	});	
	
	//黄金明2019.8.29
	//部门管理
		var pageInfo_id_de=$("#departmentconf_pageInfo ul li");
		pageInfo_id_de.find("select").on("change",function(){
			var pageCurrentNum=this.value;//获取当前点击的页数
			//alert(pageCurrentNum);
			getAlldepartmentSelect(pageCurrentNum);
		});
		//向前翻页
		pageInfo_id_de.find("#previousPage").on("click",function(){
			var pageCurrentNum=pageInfo_id_de.find("select option:selected").val();
			getAlldepartmentSelect(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
		});
		//向后翻页
		pageInfo_id_de.find("#nextPage").on("click",function(){
			var pageCurrentNum=pageInfo_id_de.find("select option:selected").val();
			var pageNum=pageInfo_id_de.find("#pageNum").text();//总页数
			getAlldepartmentSelect(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
		});
		
		//线下课程记录
				var pageInfo_id_or=$("#offlineRecord_pageInfo ul li");
				pageInfo_id_or.find("select").on("change",function(){
					var pageCurrentNum=this.value;//获取当前点击的页数
					//alert(pageCurrentNum);
					getAllofflineRecordSelect(pageCurrentNum);
				});
				//向前翻页
				pageInfo_id_or.find("#previousPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_or.find("select option:selected").val();
					getAllofflineRecordSelect(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
				});
				//向后翻页
				pageInfo_id_or.find("#nextPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_or.find("select option:selected").val();
					var pageNum=pageInfo_id_or.find("#pageNum").text();//总页数
					getAllofflineRecordSelect(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
				});
				
				//反馈记录表
				var pageInfo_id_bg=$("#backRecord_pageInfo ul li");
				pageInfo_id_bg.find("select").on("change",function(){
					var pageCurrentNum=this.value;//获取当前点击的页数
					//alert(pageCurrentNum);
					getAllfeedBackFormSelect(pageCurrentNum);
				});
				//向前翻页
				pageInfo_id_bg.find("#previousPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_bg.find("select option:selected").val();
					getAllfeedBackFormSelect(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
				});
				//向后翻页
				pageInfo_id_bg.find("#nextPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_bg.find("select option:selected").val();
					var pageNum=pageInfo_id_bg.find("#pageNum").text();//总页数
					getAllfeedBackFormSelect(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
				});
				
				//学分总评信息
				var pageInfo_id_yp=$("#yearEnd_pageInfo ul li");
				pageInfo_id_yp.find("select").on("change",function(){
					var pageCurrentNum=this.value;//获取当前点击的页数
					//alert(pageCurrentNum);
					getAllyearEndSelect(pageCurrentNum);
				});
				//向前翻页
				pageInfo_id_yp.find("#previousPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_yp.find("select option:selected").val();
					getAllyearEndSelect(pageCurrentNum==1?1:parseInt(pageCurrentNum)-1);
				});
				//向后翻页
				pageInfo_id_yp.find("#nextPage").on("click",function(){
					var pageCurrentNum=pageInfo_id_yp.find("select option:selected").val();
					var pageNum=pageInfo_id_yp.find("#pageNum").text();//总页数
					getAllyearEndSelect(pageCurrentNum==pageNum?pageNum:parseInt(pageCurrentNum)+1);
				});
		
})

/**
 * 计算分页信息
 */
function page(data,pageInfo_id,pageCurrentNum){
	var result=new Array();
	var total=data.length;//总记录数
	var record=10;//每一页显示的记录数
	var pageNum=0;//分页数
	pageNum=Math.ceil(total/record);//获取总页数
//	alert(page);
	pageInfo_id.find("select").empty();
	for(var i=0;i<pageNum;i++){
		if(i==pageCurrentNum-1){
			pageInfo_id.find("select").append("<option selected>"+(i+1)+"</option>");			
		}else{
			pageInfo_id.find("select").append("<option>"+(i+1)+"</option>");
		}
		
	}
	pageInfo_id.find("#pageNum").text(pageNum);
}

/**
 * 返回显示的集合
 */
function pageInfo(data,pageInfo_id,pageCurrentNum){
//	alert(pageCurrentNum)
	var result=new Array();
	var total=data.length;//总记录数
	var record=10;//每一页显示的记录数
	var pageNum=0;//分页数
	pageNum=Math.ceil(total/record);//获取总页数
	var beginRecord=(pageCurrentNum-1)*record//开始显示的记录数
	var endRecord=pageCurrentNum*record//开始显示的记录数
//	alert(beginRecord)
//	alert(endRecord)
//	alert(data.length);
	$.each(data,function(index,item){		
		if(index>=beginRecord && index<endRecord){
//			alert(data.length);
			result.push(item);
		}else{
			
		}
	});
	
	return result;
}

/**
 * 下一页
 */
function nextPage(){
	
}