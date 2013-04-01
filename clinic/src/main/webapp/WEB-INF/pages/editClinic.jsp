<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h2>Add Clinic</h2>
	<s:form action="saveClinic">
		<s:push value="clinic">
			<s:hidden name="id" />
			<s:textfield name="name" label="Name :" />
			<s:textfield name="code" label="Code :" />
		</s:push>
		<s:submit />
	</s:form>
</body>
</html>