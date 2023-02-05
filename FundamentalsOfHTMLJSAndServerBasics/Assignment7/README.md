# Assignment 7

[Click Here](https://prajeetguha.github.io/AntWalk/) to go the static website hosted for the assignment code. (NOTE: If you open the link in new tab, it may ot trigger the prompt, so please reload the page. Could not find a way to resolve these issue. 😅)

## Objective

Create a table for n number of rows and column

     Create two prompts

      -- accept value for row

      -- accept value for column

Create a function which accepts row and col  createTable(row,col)
for/while/ifelse( nested for loop)
See table for reference

## Implementation

Took number of rows and columns from prompt and use them to loop and create a string which is put inside a table tag. The string contains tr and td tags.

*Code*
```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Multiplication Table</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            background-color: black;
            color: white;
            text-align: center;
            font-size:30px;
            font-family: "Helvetica Neue",Helvetica,Arial;
            font-weight: bold;
        }
        #table{
            display: flex;
            justify-content: center;
            margin: 5px;
        }
        .row{
            border: 1px solid grey;
        }
        .cell{
            background-color:white;
            padding : 10px;
            color: brown;
        }
    </style>
</head>
<body>
    Multiplication Table
    <table id = 'table'>

    </table>
</body>
<script>
    function createTable(rows,cols){
        var string = "";
        for(var i = 0; i < rows; i++){
            string += "<tr class = 'row'>";
            for(var j = 0; j < cols; j++){
                string += ("<td class = 'cell'>" + ((i+1) * (j+1)) + "</td>");
            }
            string += "</tr>";
        }
        document.getElementById("table").innerHTML = string;
    }
    var rows = prompt("Enter number of rows");
    var columns = prompt("Enter number of columns");
    createTable(rows,columns);
</script>
</html>
```
*Execution*

![code-execution](https://user-images.githubusercontent.com/58776463/216825820-ded33256-6e86-411b-9a35-ce9d1f6c0e85.gif)
