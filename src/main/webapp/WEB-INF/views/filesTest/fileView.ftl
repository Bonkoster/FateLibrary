<#import "/additional/additional.ftl" as additional>
<@additional.head/>
	<body>
		<div id="wrapper">
			<div id="content">
				<@additional.menubar/>
			</div>
		</div>
		<div>
			<table>
				<tr>
					<td>Your Uploaded file Name: ${file.getName()}</td>
				</tr>
				<tr>
					<td>Your Uploaded file Size: ${file.length()}</td>
				</tr>
			</table>
		</div>
	</body>