<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
	<c:choose>
		<c:when test="${roleList.size() > 0}">
		<table >
			<tr>
				<th>Role Name</th>
				<th>Description</th>
			</tr>
			<s:iterator value="roleList" status="roleStatus">
				<tr>
					<td><s:property value="displayName" /></td>
					<td><s:property value="Description" /></td>
                	<td>
                		<s:url id="editUrl" action="editRole">
							<s:param name="roleId" value="%{roleId}"></s:param>
						</s:url>
                		<s:a href="%{editUrl}">Edit</s:a>
                	</td>
                	
					<td>
                		<s:url id="deleteUrl" action="deleteRole">
							<s:param name="roleId" value="%{roleId}"></s:param>
						</s:url>
                		<s:a href="%{deleteUrl}">Delete</s:a>
                	</td>
				</tr>
			</s:iterator>
		</table>
	</c:when>
	<c:otherwise>
		no role found.
	</c:otherwise>
</c:choose>

