function result(){
	
	var ca1 = parseInt(document.getElementById("ca1").value);
	var ca2 = parseInt(document.getElementById("ca2").value);
	var ca3 = parseInt(document.getElementById("ca3").value);
	var ass = parseInt(document.getElementById("ass").value);
	var att = parseInt(document.getElementById("att").value);
	var exm = parseInt(document.getElementById("exm").value);
	
    else if (ca1 > 20){
	var warn1 = document.getElementById("wrn1");
	warn1.innerHTML="ur CA cant be more than 20,HABA!!";}
	else if (ca2 > 20){
	var warn2 = document.getElementById("wrn2");
	warn2.innerHTML="ur CA cant be more than 20,HABA!!";}
	else if (ca3 > 20){
	var warn3 = document.getElementById("wrn3");
	warn3.innerHTML="ur CA cant be more than 20,HABA!!";}
	
	
	else if (ass > 30){
		var warn4 = document.getElementById("wrn4");
		warn4.innerHTML = "your assignment score cant exceed 30";
	}
	else if (att > 10){
		var warn5 = document.getElementById("wrn5");
		warn5.innerHTML = "your attendance score cant exceed 30";
	}
	else if (exm > 200){
		var warn6 = document.getElementById("wrn6");
		warn4.innerHTML = "your exam score cant exceed 200";
	}
	else {
		var total = ass + exm + att + ca1 + ca2 + ca3;
		var per = (total / 300) * 100;
		var output = document.getElementById("out");
		output.innerHTML=Math.round(per) + "%";
	}
}
result();