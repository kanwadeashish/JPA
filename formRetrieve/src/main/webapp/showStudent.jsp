<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Show Students Data</title>
</head>
<body>

<table border=1>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Email</th>
        <th>PhoneNumber</th>
    </tr>

    <c:forEach items="${dtos}" var="singleDTO">
        <tr>
            <td>${singleDTO.name}</td>
            <td>${singleDTO.surname}</td>
            <td>${singleDTO.email}</td>
            <td>${singleDTO.phoneNumber}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>