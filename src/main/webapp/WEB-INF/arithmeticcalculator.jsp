<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <label for="first">First: </label>
            <input type="number" name="first" id="first" value=${firstEntry}>
            <br>
            <label for="second">Second: </label>
            <input type="number" name="second" id="second" value=${secondEntry}>
            <br>
            <button name="operation" value="add">+</button>
            <button name="operation" value="subtract">-</button>
            <button name="operation" value="multiply">*</button>
            <button name="operation" value="divide">%</button>
        </form>

        <p>Result: ${output}</p>
        
        <p><a href="age">Age Calculator</a></p>
        
    </body>
</html>
