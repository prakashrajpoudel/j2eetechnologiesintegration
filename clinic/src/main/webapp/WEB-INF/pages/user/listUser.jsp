<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<s:form>
	<s:textfield name="name" label="Search :" />
	<s:submit />
</s:form>
   <c:choose>
	<c:when test="${userList.size() > 0}">
	<display:table class="resultDisplayTable" export="true"  id="userData" name="userList" requestURI="/listUser" pagesize="10" >
        	<display:column property="fname" title="First Name" sortable="true"   />
            <display:column property="lname" title="Last Name" sortable="true"  />
            <display:column media="html"> 
                		<s:url id="editUrl" action="editUser">
							<s:param name="id">${userData.id}</s:param>
						</s:url>
                		<s:a href="%{editUrl}">Edit</s:a>
                		&nbsp;
                		<s:url id="deleteUrl" action="deleteUser">
							<s:param name="id">${userData.id}</s:param>
						</s:url>
                		<s:a href="%{deleteUrl}">Delete</s:a>
    		</display:column>
    		<display:setProperty name="paging.banner.placement" value="bottom" />
	</display:table>
	</c:when>
	<c:otherwise>
		no user found.
	</c:otherwise>
</c:choose>

