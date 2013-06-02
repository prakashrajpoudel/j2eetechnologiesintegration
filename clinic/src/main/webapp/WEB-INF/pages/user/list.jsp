<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="middlecontent">
	<div id="maincontent">
	<c:choose>
		<c:when test="${userList.size() > 0}">
		<table >
			<tr>
				<th>First Name</th>
				 <th>Last Name</th>
			</tr>
			<s:iterator value="userList" status="userStatus">
				<tr>
					<td><s:property value="fname" /></td>
					<td><s:property value="lname" /></td>
				</tr>
			</s:iterator>
		</table>
	</c:when>
	<c:otherwise>
		no user found.
	</c:otherwise>
</c:choose>
	</div>
</div>
