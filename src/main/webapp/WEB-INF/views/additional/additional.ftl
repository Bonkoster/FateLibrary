<#import "/spring.ftl" as spring/>
<#macro head>
	<head>
		<title>${title}</title>
		<header>
			<link rel="stylesheet" type="text/css" href="<@spring.url '/resources/css/main.css'/>" >
		<header>
	</head>
</#macro>
<#macro menubar>
	<div>
		<ul id="menubar">
			<li><a href="<@spring.url '/'/>">Main<a/></li>
			<li><a href="<@spring.url '/masters'/>">Masters<a/></li>
			<li><a href="<@spring.url '/servants'/>">Servants</a></li>
		</ul>
	</div>	
</#macro>
<#macro footer>
	<footer>
		<h1>Footer</h1>
	</footer>
</#macro>