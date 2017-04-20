<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
</head>
<body>
	<h1>FInd City Temperature</h1>
	<input type="text"  name="cityName" id="cityName" />

	<div id="result"></div>
</body>
</html>
<script>
	$(document).ready(function() {
	
		$( "#cityName" ).keyup(function(e){
			
			var cityName=$("#cityName").val();
			if(cityName.length >= 3)
				{
				console.log(e.which);
				getTemp();
				}
		});
		
		
	});
	

	function getTemp()
	{
		
		var cityName=$("#cityName").val();
		console.log(cityName);
		var url='http://localhost:8888/city-temp-manager/get-city-'+cityName+'-temp-list';
		var data={};
		$.get({url,data,
			  success:function(result){
				  console.log("success")
				  $("#result").html(JSON.stringify(result));
			  },
			  error:function(result){
				  console.log("success")
				  $("#result").html(JSON.stringify(result));
			  }
				});
	}
	
</script>
