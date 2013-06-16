<%@ taglib prefix="s" uri="/struts-tags"%>

		<h2>Edit User</h2>
		<s:form action="saveUser">
			<s:push value="user">
				<s:hidden name="id" />
				<s:textfield name="fname" label="First Name :" />
				<s:textfield name="mname" label="Middle Name :" />
				<s:textfield name="lname" label="Last Name :" />
				<s:textfield name="username" label="User Name :" />
				<s:textfield name="email" label="Email :" />
				<s:hidden name="status" value="A" />
				<s:hidden name="createdBy" value="1" />
			</s:push>
			<s:submit />
		</s:form>
