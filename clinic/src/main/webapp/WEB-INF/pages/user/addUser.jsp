<%@ taglib prefix="s" uri="/struts-tags"%>

<script>
$.validator.setDefaults({
	submitHandler: function() { alert("submitted!"); }
});

$().ready(function() {

	// validate signup form on keyup and submit
	$("#registrationForm").validate({
		rules: {
			fname: "required",
			lastname: "required",
			username: {
				required: true,
				minlength: 2
			},
			password: {
				required: true,
				minlength: 5
			},
			confirmPassword: {
				required: true,
				minlength: 5,
				equalTo: "#registrationForm_password"
			},
			email: {
				required: true,
				email: true
			},
			confirmEmail: {
				required: true,
				equalTo: "#registrationForm_email"
			},
			agree: "required"
		},
		messages: {
			firstname: "Please enter your firstname",
			lastname: "Please enter your lastname",
			username: {
				required: "Please enter a username",
				minlength: "Your username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			},
			confirmPassword: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long",
				equalTo: "Please enter the same password as above"
			},
			email: "Please enter a valid email address",
			confirmEmail: {
				required: "Please provide an email address",
				equalTo: "Please enter the same email as above"
			},
			agree: "Please accept our policy"
		}
	});

	//code to hide topic selection, disable for demo
	var newsletter = $("#newsletter");
	// newsletter topics are optional, hide at first
	var inital = newsletter.is(":checked");
	var topics = $("#newsletter_topics")[inital ? "removeClass" : "addClass"]("gray");
	var topicInputs = topics.find("input").attr("disabled", !inital);
	// show when newsletter is checked
	newsletter.click(function() {
		topics[this.checked ? "removeClass" : "addClass"]("gray");
		topicInputs.attr("disabled", !this.checked);
	});
});
</script>

<style type="text/css">
#registrationForm { width: 670px; }
#registrationForm label.error {
	margin-left: 10px;
	width: auto;
	display: inline;
}

</style>
		<h2>Add User</h2>
		<s:form action="saveUser" id="registrationForm" cssClass="cmxform">
			<s:push value="user">
				<s:hidden name="id" />
				<s:textfield name="fname" label="First Name " />
				<s:textfield name="mname" label="Middle Name " />
				<s:textfield name="lname" label="Last Name " cssClass="required" />
				<s:textfield name="username" label="User Name " />
				<s:textfield name="password" label="Password " />
				<s:textfield name="confirmPassword" label="Confirm Password " />
				<s:textfield name="email" label="Email " />
				<s:textfield name="confirmEmail" label="Confirm Email " />
				<s:hidden name="status" value="A" />
				<s:hidden name="createdBy" value="1" />
			</s:push>
			<s:submit />
		</s:form>
		
		
	