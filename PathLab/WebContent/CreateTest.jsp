<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Test</title>
<link type="text/css" href="css/styles.css" rel="stylesheet"></link>
<script type="text/javascript" src="jslibs/jquery-1.12.1.js"></script>

<script type="text/javascript">
	function newRow(){
		var xmlhttpobject = new XMLHttpRequest();
		
		xmlhttpobject.onreadystatechange=function()
		{
			
			if(xmlhttpobject.readyState == 4 && xmlhttpobject.status == 200)
				
				{
				var row = document.getElementById("newRow");
				
				row.innerHTML += xmlhttpobject.responseText;
				
				}
		};
		xmlhttpobject.open("GET","text/newRow.txt",true);
	xmlhttpobject.send();
		
	}

	function init(){
		for(i=0;i<5;i++){
			newRow();	
		}
		
	}
	
	function totalValue(amount){
		totalAmt = document.getElementById("total");
		totalval = parseInt(totalAmt.value);
		
		if(amount.value != ""){
			totalval += parseInt(amount.value);
			
		}
		else{
			totalval = 0;
			r1 = document.getElementById("newRow").lastChild;
		
			
			while(r2.previousSibling != null)
				row = r1.childNodes;
				alert(row[2].nodeValue);
				//totalval += parseInt(row[2].value);
				alert(totalval);
		}
		
		totalAmt.value = totalval;
		
	}

	
</script>


</head>


<body onload="init()">
	<form action="" method="">

<div class="main" >
	<table border="2px" >

  <tr>
		<td><label><b>Order No.</b></label></td>
		<td><input type="number" id="orderNo" required="required"></td>
		
		<td><label><b>Collection Date</b></label></td>
		<td><input type="date" id="collDate" required="required"></td>
		
		<td><label><b>Collection Type</b></label></td>
		<td> Lab<input type="radio" id="collType"  value="lab">
		 Home<input type="radio" id="collType"  value="home"></td>
	</tr>
	

	<tr>
		<td><label><b>Patient Code</b></label></td>
		<td><input type="number" id="patientCode" required="required"></td>
		
		<td><label><b>Patient Name</b></label></td>
		<td><input type="text" id="patientName" required="required"></td>
		
		<td><label><b>Age </b></label></td>
		<td><input type="number" id="age" required="required"></td>
		
	</tr>
	<tr>
		<td><label><b>Hand Phone</b></label></td>
		<td><input type="number" id="handPhone" required="required" ></td>
		
		<td><label><b>Email</b></label></td>
		<td><input type="email" id="email" required="required" ></td>
		
		<td><label><b>Gender</b></label></td>
		<td> Male<input type="radio" id="m"  value="m">
		 Female<input type="radio" id="f"  value="f">	</td>
	</tr>
	
	<tr>
		<td><label><b>Doctor Code</b></label></td>
		<td><input type="number" id="docCode" required="required"></td>
		
		<td colspan="2"><label><b>Doctor Name</b></label></td>
		<td><input type="text" id="docName" required="required" ></td>
		
			
	</tr>
	
	</table>
	
	<h1 style="text-align: center;">Test Details</h1>
	
	<table border="2px">
	<tbody id="newRow">
		<tr>
		<th>Test Code</th>
		<th>Test Name</th>
		<th>Amount</th>		
	</tr>
	</tbody>
	<tr>
	<td colspan="2">Total:
	<td><input type="text" id = "total" value="0" >
	</table>
	
	<br>
	<div style="text-align: center;">
	<input type="button" value="Add new Row" onclick="newRow()">
	<input type="submit" value="Submit" >
	</div>
</div>
</form>
	<script type="text/javascript">
	$(function(){
		
		$("#patientCode").on("blur",function(){
			
			var patientCode = $(this).val();
			
			$.ajax({
				type :'GET',
				url :"json/patient.json",
				dataType : "text",
				
				success : function(data){
					var flag  = false;
					var docArray = $.parseJSON(data);
					
					for(var i=0;i <docArray.length;i++){
						if(patientCode == docArray[i].patientCode){
							$("#patientName").val(docArray[i].patientName);
							$("#age").val(docArray[i].age);
							$("#handPhone").val(docArray[i].handPhone);
							$("#email").val(docArray[i].email);
							$('#'+ docArray[i].gender).prop('checked',true);
							flag = true;
						}
					}
				}
			});
				
			});
			
		});

	
		</script>
	
</body>
</html>