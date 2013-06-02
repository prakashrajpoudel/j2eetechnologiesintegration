<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" type="text/css" href="<s:url value="/menu/pro_dropdown_2.css"/>"/> 
<script src="<s:url value="/menu/stuHover.js"/>" type="text/javascript"></script>

<div id="systemMenu">

<ul id="nav">
	<li class="top"><s:url id="listClinicUrl" action="listClinic" /> <s:a href="%{listClinicUrl}" cssClass="top_link"><span>Home</span></s:a></li>
	<li class="top"><s:url id="listClinicUrl" action="listClinic" /> <s:a href="%{listClinicUrl}" cssClass="top_link"><span class="down">Clinic</span></s:a>
	<ul class="sub">
			<li><s:url id="listClinicUrl" action="listClinic" /> <s:a href="%{listClinicUrl}" >Clinic List</s:a></li>
			<li ><s:url id="addURL" action="addClinic" /> <s:a href="%{addURL}">Add Clinic</s:a></li>
		</ul>
	</li>
	
	<li class="top"><s:url id="listUser" action="listUser" /> <s:a href="%{listUser}" cssClass="top_link"><span class="down">User</span></s:a>
	<ul class="sub">
			<li><s:url id="listUser" action="listUser" /> <s:a href="%{listUser}" >User List</s:a></li>
			<li ><s:url id="addURL" action="addUser" /> <s:a href="%{addURL}">Add User</s:a></li>
		</ul>
	</li>

	<li class="top"><a href="#nogo27" id="contacts" class="top_link"><span class="down">Sample Menu</span></a>
		<ul class="sub">
			<li><a href="#nogo28">Support</a></li>
			<li><a href="#nogo29" class="fly">Sales</a>
				<ul>
					<li><a href="#nogo30">USA</a></li>
					<li><a href="#nogo33" class="fly">European</a>
						<ul>
							<li><a href="#nogo34" class="fly">British</a>
								<ul>
									<li><a href="#nogo38" class="fly">Bristol</a>
										<ul>
											<li><a href="#nogo41">Eastville</a></li>
										</ul>
									</li>
									<li><a href="#nogo43">Belfast</a></li>
								</ul>
							</li>
							<li><a href="#nogo46">Spanish</a></li>
						</ul>
					</li>
					<li><a href="#nogo48">Asian</a></li>
				</ul>
			</li>
		</ul>
	</li>
	<li><a href="<c:url value="j_spring_security_logout" />" class="logout"> Logout</a></li>
</ul>


</div>