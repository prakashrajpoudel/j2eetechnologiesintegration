<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<ul>
	<li><s:url id="listClinicUrl" action="listClinic" /> <s:a
			href="%{listClinicUrl}">Home</s:a></li>
</ul>

<ul>
	<li><s:url id="addURL" action="addClinic" /> <s:a
			href="%{addURL}">Add Clinic</s:a></li>
</ul>