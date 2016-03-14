

(function(){
	
	nameCheck();
	displayValues();
	
})();
function nameCheck(){
	
	var nameEle = document.getElementById("uname");
   
	nameEle.addEventListener('blur', function(event){
		
		nameEle.value=prompt("Is this the name your want?", nameEle.value);
		
		
		
	});
	
}


function displayValues(){
	
	var name=document.getElementById("uname");
	var location = document.getElementById("location");
	var paymentMode = document.getElementsByName("payment");
	var submit= document.getElementById("submit");
	var gift = document.getElementsByName("checkbox1");
	var index = location.selectedIndex;
	var locationValue = location.options[index].value;
	
	var mode ="";
	var radioResult = "";
	
		
	submit.addEventListener('click', function(event){
		
		for(var i = 0; i < paymentMode.length; i++){
			
		    if(paymentMode[i].checked){
		        mode = paymentMode[i].value;
		    }  
		}
		
		for(var i=0;i<gift.length;i++){
		if(gift[i].checked){
			radioResult+=gift[i].value + " ";
			}
		}
	
	
		confirm("Dear " + name.value + "\nPlease Confirm your choices: \nPayment Mode: " + mode +"\n Location: "
				+location.value +"\nGifts: " + radioResult);
	});
	
}

