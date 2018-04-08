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
			<a href="<@spring.url '/'/>"><li>Main</li><a/>
			<a href="<@spring.url '/masters'/>"><li>Masters</li><a/>
			<a href="<@spring.url '/servants'/>"><li>Servants</li></a>
		</ul>
	</div>	
</#macro>
<#macro footer>
	<footer>
		<h1>Footer</h1>
	</footer>
</#macro>