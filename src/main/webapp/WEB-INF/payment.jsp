<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Payment Page</title>
</head>
<body>
<form method="post">
    Title: <input type="text" name="title">
    <br>
    Description: <input type="text" name="description">
    <br>
    Category: <input type="text" name="category">
    <br>
    Price: <input type="text" name="price">
    <br>
    <button>Add Invoice</button>
</form>

<form action="invoice" method="get">
    <button>Go Back</button>
</form>

</body>
</html>