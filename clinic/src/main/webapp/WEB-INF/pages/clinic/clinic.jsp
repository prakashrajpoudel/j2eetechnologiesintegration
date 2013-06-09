<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Struts 2 + Spring + Hibernate integration example</h1>
 
<h2>Add Customer</h2>
<s:form action="addCustomerAction" >
  <s:textfield name="name" label="Name" value="" />
  <s:textarea name="address" label="Address" value="" cols="50" rows="5" />
  <s:submit />
</s:form>
 
<h2>All Customers</h2>
 
<s:if test="clinicList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Customer Id</th>
		<th>Name</th>
		<th>Address</th>
		<th>Created Date</th>
	</tr>
	<s:iterator value="clinicList" status="userStatus">
		<tr>
			<td><s:property value="id" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="code" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>
 
</body>
</html>