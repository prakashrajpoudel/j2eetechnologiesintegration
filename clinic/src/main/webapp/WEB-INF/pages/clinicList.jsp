<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
				</tr>
			</s:iterator>
		</table>
	</c:when>
	<c:otherwise>
		no clinic found.
	</c:otherwise>
</c:choose>
