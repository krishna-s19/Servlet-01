function validate(frm){
	
	document.getElementById("pnameErr").innerHTML=""
		document.getElementById("pageErr").innerHTML="" 
			document.getElementById("paddressErr").innerHTML=""
	
	
	let name = frm.name.value;
	let age = frm.age.value;
	let address = frm.address.value;
	let flag = true;
	
	if(name==""){
		flag=false;
	//	alert("Person name is required");
		document.getElementById("pnameErr").innerHTML="Person name is required"
		frm.name.focus();
	}
	else if(name.length<10){
		flag=false;
		//alert("Person name is must have minimum 10 charactres");
		document.getElementById("pnameErr").innerHTML="Person name is must have minimum 10 charactres"
		frm.name.focus();		
	}
		
	 if(age==""){
		flag=false;
		//alert("Person age is required");
		document.getElementById("pageErr").innerHTML="Person age is required"
				frm.age.focus();
	}
		else  if(isNaN(age)){
		flag=false;
		//alert("Person age is Numeric values only");
		document.getElementById("pageErr").innerHTML="Person age is Numeric Values only"
		frm.age.focus();
		}
	  
	else if(age<1  || age> 125){
		flag=false;
		//alert("Person age is in between 1 to 125 only");
		document.getElementById("pageErr").innerHTML="Person age is in between 1 to 125"
		
		frm.age.focus();
	}
	 
		if(address==""){
			flag=false;
			//alert("Person address is required");
			document.getElementById("paddressErr").innerHTML="Person address  is required"
			frm.address.focus();
		}
		return flag;
	}