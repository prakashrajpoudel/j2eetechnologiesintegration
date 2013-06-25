<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>

<s:form>
	<s:textfield name="name" label="Search :" />
	<s:submit />
</s:form>
   <c:choose>
	<c:when test="${clinicList.size() > 0}">
	<display:table class="resultDisplayTable" export="true"  id="clinicData" name="clinicList" requestURI="/listClinic" pagesize="10" >
        	<display:column property="name" title="Name" sortable="true"   />
            <display:column property="code" title="Code" sortable="true"  />
            <display:column media="html"> 
		            	<s:url id="editUrl" action="editClinic">
					<s:param name="id">${clinicData.id}</s:param>
				</s:url>
                <s:a href="%{editUrl}">Edit</s:a>&nbsp;
        		<s:url id="deleteUrl" action="deleteClinic">
					<s:param name="id">${clinicData.id}</s:param>
				</s:url>
                <s:a href="%{deleteUrl}">Delete</s:a>
    		</display:column>
    		<display:setProperty name="paging.banner.placement" value="bottom" />
	</display:table>
	</c:when>
	<c:otherwise>
		no clinic found.
	</c:otherwise>
</c:choose>
