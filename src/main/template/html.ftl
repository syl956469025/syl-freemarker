<html>
<head>
<title>Welcome!</title>
</head>
<body>

<ul>
	<#list plist as p>
		<li>${p.name}</li>
		<li>${p.address}</li>
		<li>${p.age}</li>
		<li>${p.detail}</li>
	</#list>
</ul>

<ul>
	<#list alist as a>
		<li>${a.name}</li>
		<li>${a.address}</li>
		<li>${a.age}</li>
		<li>${a.detail}</li>
	</#list>
</ul>



</body>
</html>