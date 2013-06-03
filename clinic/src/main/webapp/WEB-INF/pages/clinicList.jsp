<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="middlecontent">
	<div id="maincontent">
<s:form>
	<s:textfield name="name" label="Search :" />
	<s:submit />
</s:form>
   <c:choose>
	<c:when test="${clinicList.size() > 0}">
		<table >
			<tr>
				<th>Name</th>
				<th>Code</th>
			</tr>
			<s:iterator value="clinicList" status="userStatus">
				<tr>
					<td><s:property value="name" /></td>
					<td><s:property value="code" /></td>
					<td>
                		<s:url id="editUrl" action="editClinic">
							<s:param name="id" value="%{id}"></s:param>
						</s:url>
                		<s:a href="%{editUrl}">Edit</s:a>
                	</td>
					<td>
                		<s:url id="deleteUrl" action="deleteClinic">
							<s:param name="id" value="%{id}"></s:param>
						</s:url>
                		<s:a href="%{deleteUrl}">Delete</s:a>
                	</td>
				</tr>
			</s:iterator>
		</table>
	</c:when>
	<c:otherwise>
		no clinic found.
	</c:otherwise>
</c:choose>
	</div>
</div>
