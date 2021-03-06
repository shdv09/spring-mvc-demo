<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>

    <title>Student registration form</title>

</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br>
    <br>

    Last name: <form:input path="lastName"/>

    <br>
    <br>

    Country: <form:select path="country">

    <form:options items="${theCountryOptions}"/>

</form:select>

    <br>
    <br>

    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>

    <br>
    <br>

    <form:checkbox path="operatingSystems" value="Windows"/> Windows
    <form:checkbox path="operatingSystems" value="Linux"/> Linux
    <form:checkbox path="operatingSystems" value="MacOS"/> MacOS

    <br>
    <br>

    <input type="submit" value="Submit"/>

</form:form>

</body>

</html>