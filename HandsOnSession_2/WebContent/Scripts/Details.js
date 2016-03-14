
(function(){


	saleItem();
})();



function saleItem(){
	
	var totalamt=document.getElementById("totalamt");
	var result=parseInt(totalamt.value);
	var chk11=document.getElementById("chk11");
	var chk12=document.getElementById("chk12");
	var chk13=document.getElementById("chk13");
	var chk14=document.getElementById("chk14");
	
	chk11.addEventListener('change',function(event){
		
		if(chk11.checked){
			result=result+ parseInt(chk11.value);
			
		}
		else{
			result=result-parseInt(chk11.value);
		}
		totalamt.value = result;
	});
	chk12.addEventListener('change',function(event){
		
		if(chk12.checked){
			result=result+parseInt(chk12.value);
		}
		else{
			result=result-parseInt(chk12.value);
		}
		totalamt.value = result;
	});
	chk13.addEventListener('change',function(event){
	
	if(chk13.checked){
		result=result+parseInt(chk13.value);
	}
	else{
		result=result-parseInt(chk13.value);
	}
	totalamt.value = result;
	});
	chk14.addEventListener('change',function(event){
	
	if(chk14.checked){
		result=result+parseInt(chk14.value);
	}
	else{
		result=result-parseInt(chk14.value);
	}
	totalamt.value = result;
	});

	
	
}