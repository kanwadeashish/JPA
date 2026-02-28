<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<h2>
    Student Registration Form
</h2>
<form action="saveDetails" method="post">

    <label for="name">Name : </label><br>
    <input type="text" placeholder="Enter your name" name="name" id="name" required><br><br>

    <label for="surname">Surname : </label><br>
    <input type="text" placeholder="Enter your surname" name="surname" id="surname" required><br><br>

    <label for="email">Email : </label><br>
    <input type="email" placeholder="Enter your email" name="email" id="email" required><br><br>

    <label for="age">Age : </label><br>
    <input type="number" placeholder="Enter your age" name="age" id="age" required><br><br>

    <label for="percentage">Percentage : </label><br>
    <input type="number" placeholder="Enter your percentage" step=0.01 name="percentage" id="percentage" required><br><br>

    <button type="submit">Submit</button>
</form>

<h2>
    Get Student Data Button
</h2>

<form action="readData" method="post">
<button>ReadData</button>
</form>

</body>
</html>
