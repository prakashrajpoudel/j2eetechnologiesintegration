<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="icon" type="image/png" href="<s:url value="/images/faviicon.png"/>">
<link rel="stylesheet" type="text/css" href="<s:url value="/style/masterstyle.css"/>"/> 
<script src="<s:url value="/js/jquery-1.9.1.min.js"/>"></script>
<script src="<s:url value="/js/jquery.validate.js"/>"></script>
</head>
<body>

	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="menu">
			<div id="links">
				<tiles:insertAttribute name="menu" />
			</div>
		</div>
		<div id="middlecontent">
			<div id="maincontent">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>

