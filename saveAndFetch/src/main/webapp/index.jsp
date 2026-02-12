<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

<h2>
    Form -->
</h2>

<form action="saveData" method="post">

    <label for="name">Name : </label><br>
    <input type="text" placeholder="Enter your name" name="name" id="name" required><br><br>

    <label for="surname">Surname : </label><br>
    <input type="text" placeholder="Enter your surname" name="surname" id="surname" required><br><br>

    <label for="age">Age : </label><br>
    <input type="number" placeholder="Enter your age" name="age" id="age" required><br><br>

    <label for="username">Username : </label><br>
    <input type="text" placeholder="Enter your username" name="username" id="username" required><br><br>

    <label for="phoneNumber">PhoneNumber : </label><br>
    <input type="number" placeholder="Enter your phoneNumber" name="phoneNumber" id="phoneNumber" required><br><br>

    <button type="submit">Submit</button>
</form>

</body>
</html>