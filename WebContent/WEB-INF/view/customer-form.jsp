<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer</title>

    <style>
        .error {color:red}
    </style>

</head>
<body>

<i> Fill out fields. Asterisk means required </i>

<br> <br>

<form:form action="processForm" modelAttribute="customer">

    First Name: <form:input type="text" path="firstName"/>
    <br> <br>
    Last Name: (*) <form:input type = "text" path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br> <br>
    <input type="submit" value="Submit" />

</form:form>

</body>
</html>
