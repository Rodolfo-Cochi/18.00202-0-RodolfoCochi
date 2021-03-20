const express = require ("express");
const axios = require("axios");

const app = express();
app.use(express.json());

app.post("/eventos", (req, res) => {
    const evento = req.body;
    console.log(evento);
    //Envia o evento para o microsservico de lembretes
    axios.post("http://localhost:4000/eventos", evento);
    //envia o evento para o microsservico de observacoes
    axios.post("http://5000/eventos", evento);
    //envia o evento para o microsservico de consulta
    axios.post("http://localhost:6000/eventos", evento);
    res.status(200).send({msg: "ok"});
});

app.listen(10000, () => console.log("Microsservico rodando na porta 10000"));
