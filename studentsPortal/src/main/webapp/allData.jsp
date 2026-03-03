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
    <th>Age</th>
    <th>College Name</th>
    <th>Email</th>
    <th>Phone Number</th>
</tr>

<c:forEach items="${dtos}" var="singleDTO">
    <tr>
        <td>${singleDTO.name}</td>
        <td>${singleDTO.age}</td>
        <td>${singleDTO.clgName}</td>
        <td>${singleDTO.email}</td>
        <td>${singleDTO.phoneNumber}</td>
    </tr>
</c:forEach>
</table>


</body>
</html>