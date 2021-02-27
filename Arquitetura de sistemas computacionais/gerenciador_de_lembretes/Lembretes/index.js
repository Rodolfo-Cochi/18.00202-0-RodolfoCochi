const express = require('express');
const app = express();

app.get('/Lembretes', (req, res) => {
    res.status(200).send({"resultado": "OK"});
});

app.listen(4000, () => {
    console.log("Microsservico de lembretes executando na porta 4000")
});

