<%@ taglib prefix="s" uri="/struts-tags"%>

		<h2>Add Role</h2>
		<s:form action="saveRole">
			<s:push value="role">
				<s:hidden name="roleId" />
				<s:textfield name="roleName" label="Name :" />
				<s:textfield name="displayName" label="Display Name :" />
				<s:textfield name="description" label="Description :" />
			</s:push>
			<s:submit />
		</s:form>
