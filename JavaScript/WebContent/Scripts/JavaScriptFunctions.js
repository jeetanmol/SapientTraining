/**
 * 
 */


function normalFunction(){
	
	alert("I am a Normal Function");
}


function withArgFunction(name){
	
	alert("Welcome to JavaScript Functions" + name);
}

function returnFunction(name){
	
	return "Welcome to JavaScript" +name;
}

function takeFunctionAsArg(func){
	
	var recvd=func;
	alert(recvd());
}

function returningFunctions(){
	
	return{
		addClass:function(){
			alert("Add Class Called");
		},
		removeClass:function(){
			
			alert("remove Class Called");
		}
	};
}