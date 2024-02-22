<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type='text/javascript' src="/script.js"></script>
</head>
<body>
<h3>Список победителей:</h3>
<#list winners?keys as winnerName>
    ${winnerName}: ${winners[winnerName]} <br>
</#list>
</body>
</html>