<%@ page isELIgnored="false" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
</head>
<body>

<table border="1">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>College Name</th>
    </tr>

<c:forEach items="${data}" var="singleData">
    <tr>
        <td>${singleData.name}</td>
        <td>${singleData.age}</td>
        <td>${singleData.email}</td>
        <td>${singleData.contactNumber}</td>
        <td>${singleData.collegeName}</td>
    </tr>
</c:forEach>

</table>

</body>
</html>