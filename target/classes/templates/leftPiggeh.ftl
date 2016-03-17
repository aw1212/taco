<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Look its a game</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/guess.css"></link>
    <link rel="stylesheet" type="text/css" href="css/main.css"></link>
</head>
<body>
    <p class="game-header top">Guess The Number</p>
    <form action="/guessNumber" method="POST" class="top-game">
        <div class="form-group error number">
        <#if numberError??>
            ${numberError}
        </#if>
        </div>
        <div class="form-group add-word">
            <textarea name="number"></textarea>
        </div>
        <div class="form-group enter-button">
                <input type="submit" value="Enter" class="btn btn-primary" <#if wonNumber??>disabled</#if>>
        </div>
    </form>
    <#if wonNumber??>
    <p class="win-text top">You Won</p>
    <p class="game-header left">Guess The Word</p>
    <form action="/flashWord" method="GET">
        <div class="show-word btn">
            <input type="submit" value="Show Word" class="btn btn-primary" <#if wonWord??>disabled</#if>>
        </div>
    </form>
    <div class="show-word word">
        <#if flashedWord??>
            ${flashedWord}
        </#if>
    </div>
    <form action="/guessWord" method="POST" class="left-game">
        <div class="form-group error word">
        <#if wordError??>
            ${wordError}
        </#if>
        </div>
        <div class="form-group add-word">
            <textarea name="word"></textarea>
        </div>
        <div class="form-group enter-button">
            <input type="submit" value="Enter" class="btn btn-primary" <#if wonWord??>disabled</#if>>
        </div>
    </form>
    </#if>
</body>
</html>