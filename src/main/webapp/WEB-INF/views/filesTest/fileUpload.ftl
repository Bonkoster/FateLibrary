<#import "/additional/additional.ftl" as additional>
<@additional.head/>
	<body>
		<div id="wrapper">
			<div id="content">
				<@additional.menubar/>
			</div>
		</div>
		<div>
			<form method="POST" action="fileUploadAction" enctype="multipart/form-data">
				<table>
					<tr>
						<td>File to upload: <input type="file" name="file" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Upload" /></td>
					</tr>
				</table>
			</form>
		</div>
	</body>
	<@additional.footer/>