<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>College Form</title>
</head>
<body>

<h2>College Registration Form</h2>

<h2 style="color:green">${msg}</h2>

<form action="savaData" method="post">

    <label for="name">Name :</label><br>
    <input type="text" placeholder="Enter your name" id="name" name="name" required><br><br>

    <label for="age">Age :</label><br>
    <input type="number" placeholder="Enter your age" id="age" name="age" required><br><br>

    <label for="email">Email :</label><br>
    <input type="text" placeholder="Enter your email" id="email" name="email" required><br><br>

    <label for="contactNumber">Contact Number :</label><br>
    <input type="number" placeholder="Enter your contactNumber" id="contactNumber" name="contactNumber" required><br><br>

    <label for="collegeName">College Name :</label><br>
    <input type="text" placeholder="Enter your collegeName" id="collegeName" name="collegeName" required><br><br>

    <button type="submit">Submit</button>

</form>

<form action="readData" method="post">
    <button type="submit">Read Data</button>
</form>

</body>
</html>
