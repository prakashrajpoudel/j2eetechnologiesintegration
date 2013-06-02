<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<ul id="trans-nav">
  <li><s:url id="listClinicUrl" action="listClinic" /> <s:a href="%{listClinicUrl}">Home</s:a></li>
    <li><a href="#">Clinic</a>
        <ul>
           <li><s:url id="addURL" action="addClinic" /> <s:a href="%{addURL}">Add Clinic</s:a></li>
           <li><s:url id="listClinicUrl" action="listClinic" /> <s:a href="%{listClinicUrl}">List Clinic</s:a> </li>
        </ul>
    </li>
    
    <li><a href="#">User</a>
        <ul>
            <li><s:url id="addURL" action="addUser" /> <s:a href="%{addURL}">Add User</s:a></li>
        </ul>
    </li>
    <li><a href="#">Contact</a></li>
</ul>