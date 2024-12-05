<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script>
        
       

        let onFetchMainPhpCOmpleted = (response) => {
            console.log(responsex.text().then((data) => {
                document.getElementById('result').innerText = data;
            }));
        }

        let onBtnClickFunction = () => {
            fetch('main.php').then(onFetchMainPhpCOmpleted);
        }

        let myOnLoadFunction = () => {
            window.document.getElementById('btn').addEventListener('click', onBtnClickFunction)
        }

        window.onload = myOnLoadFunction;
    </script>
</head>

<body>
    <h1>Hello World</h1>
    <button id="btn">Click Me</button>
    <span id="result"></span>
</body>

</html>