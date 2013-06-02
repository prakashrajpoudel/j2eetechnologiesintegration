<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="middlecontent">
	<div id="maincontent">
		<h2>Add User</h2>
		<s:form action="saveUser">
			<s:push value="user">
				<s:hidden name="userId" />
				<s:textfield name="fname" label="First Name :" />
				<s:textfield name="mname" label="Middle Name :" />
				<s:textfield name="lname" label="Last Name :" />
				<s:hidden name="status" value="A" />
				<s:hidden name="createdBy" value="1" />
			</s:push>
			<s:submit />
		</s:form>
	</div>
</div>
