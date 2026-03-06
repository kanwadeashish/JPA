<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
<body>

<h2>Employee Registration Form</h2>
<p>
<h2 style="color:green">${success}</h2>
<h2 style="color:red">${errormsg}</h2>

<form action="register" method="post">

    <label for="name">Name :</label><br>
    <input type="text" placeholder="Enter your name" id="name" name="name" required><br><br>

    <label for="age">Age :</label><br>
    <input type="number" placeholder="Enter your age" id="age" name="age" required><br><br>

    <label for="email">Email :</label><br>
    <input type="text" placeholder="Enter your email" id="email" name="email" required><br><br>

    <label for="contactNumber">Contact Number :</label><br>
    <input type="number" placeholder="Enter your contactNumber" id="contactNumber" name="contactNumber" required><br><br>

    <label for="companyName">Company Name :</label><br>
    <input type="text" placeholder="Enter your companyName" id="companyName" name="companyName" required><br><br>

    <button type="submit">Submit</button>

</form>

    <div>
         <button type="button"><a href="readAllData">READ ALL</a></button>
    </div>

</body>
</html>
