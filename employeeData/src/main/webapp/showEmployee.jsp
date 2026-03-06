<%@ page isELIgnored="false" %>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<table border=2>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
        <th>Contact Number</th>
        <th>Company Name</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>

   <c:forEach items="${list}" var="singleDto">
   <tr>
   <td>${singleDto.name}</td>
   <td>${singleDto.age}</td>
   <td>${singleDto.email}</td>
   <td>${singleDto.contactNumber}</td>
   <td>${singleDto.companyName}</td>
   <td><a href="getData?id=${singleDto.id}">update</a></td>
   <td><a href="deleteData?email=${singleDto.email}">Delete</a></td>
   </tr>
   </c:forEach>

</table>

</body>
</html>