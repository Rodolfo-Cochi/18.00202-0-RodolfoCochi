const express = require ('express');
const bodyParser = require ('body-parser');
const {v4:uuidv4} = require ('uuid');

const app = express();
app.use(bodyParser.json());


const observacoesPorLembreteId = {};
//localhost:5000/lembretes/:id/observacoes

app.put('/Lembretes/:id/Observacoes', (req, res) => {
    const idObs = uuidv4();
    const { texto } = req.body; 
    const observacoesdoLembrete = observacoesPorLembreteId[req.params.id] || [];
    observacoesdoLembrete.push({id: idObs, texto: texto});
    observacoesPorLembreteId[req.params.id] = observacoesdoLembrete;
    res.status(201).send(observacoesdoLembrete);
});

app.get('/Lembretes/:id/Observacoes', (req, res) =>{
    res.send(observacoesPorLembreteId[req.params.id] || []);
});

app.listen(5000, () => {console.log("Micro de observacoes. Porta 5000")
});