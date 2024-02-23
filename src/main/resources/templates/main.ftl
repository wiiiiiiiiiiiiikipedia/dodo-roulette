<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type='text/javascript' src="/script.js"></script>
</head>
<body>
    <form class="text-center" method="post" action="/fortuna/choose-winner" modelAttribute="participantForm">
        <div class="mb-3">
            <input class="form-control" type="text" name="name" placeholder="Введите ваше имя">
        </div>
        <div class="mb-3">
            <button class="btn btn-primary d-block w-100" type="submit">Выиграть приз</button>
        </div>
    </form>

    <#if prize??>
        <p>Поздравляем, ${participant.get().getName()} выиграл приз!</p>
        <button onclick="startRoulette('${prize.get().getName()}', '${prize.get().getPhotoUrl()}')">Узнать какой приз был выигран</button>
        <div id="result"></div>
    </#if>

    <#if error??>
        <p>К сожалению, вы не выиграли приз!</p>
        <p>Возникла ошибка: ${error}</p>
    </#if>
    <br>
</body>
</html>