<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <form action="update" method="post">

    <label for="id">Id :</label><br>
    <input type="number" name="id" value="${dto.id}" readonly><br>

    <label for="name">Name :</label><br>
    <input type="text" id="name" name="name" required value="${dto.name}"><br><br>

    <label for="age">Age :</label><br>
    <input type="number" id="age" name="age" required value="${dto.age}"><br><br>

    <label for="email">Email :</label><br>
    <input type="text" id="email" name="email" required  value="${dto.email}" readonly><br><br>

    <label for="contactNumber">ContactNumber :</label><br>
    <input type="number" id="contactNumber" name="contactNumber" required value="${dto.contactNumber}" readonly><br><br>

    <label for="companyName">Company Name:</label><br>
    <input type="text" id="companyName" name="companyName" required value="${dto.companyName}"><br><br>

    <button type="submit">Update</button>

    </form>
</body>
</html>