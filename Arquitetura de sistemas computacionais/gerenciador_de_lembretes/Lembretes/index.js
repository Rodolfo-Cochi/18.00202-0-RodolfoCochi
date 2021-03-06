const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.unsubscribe(bodyParser.json());

const lembretes = {};
contador = 0;

app.get('/Lembretes', (req, res) => {
    //res.status(200).send({"resultado": "OK"});
    res.send(lembretes);
});

app.put('/Lembretes', (req,res) => {

    //{texto: "Fazer cafe"}

    const { texto } = req.body;
    contador++;

    /*
    {
        1:{
            contador: 1, texto: fazer cafe
        }
    }
    */

    lembretes[contador] = {
        contador, texto
    }
    res.status(201).send(lembretes[contador]);
});

app.listen(4000, () => {
    console.log("Microsservico de lembretes executando na porta 4000")
});

