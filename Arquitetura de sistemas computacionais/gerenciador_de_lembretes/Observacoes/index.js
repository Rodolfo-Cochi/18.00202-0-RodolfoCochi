const express = require ('express');
const bodyParser = require ('body-parser');
const {v4:uuidv4} = require ('uuid');

const app = express();
app.use(bodyParser.json());


const observacoesPorLembreteId = {};
//localhost:5000/lembretes/:id/observacoes

app.put('/Lembretes/:id/Observacoes', async (req, res) => {
    const idObs = uuidv4();
    const { texto } = req.body; 
    const observacoesdoLembrete = observacoesPorLembreteId[req.params.id] || [];
    observacoesdoLembrete.push({id: idObs, texto});
    observacoesPorLembreteId[req.params.id] = observacoesdoLembrete;
    await axios.post('http://localhost:10000/eventos', {
        tipo: "ObservacaoCriada", 
        dados: {
            id: idObs, texto, lembreteId: req.params.id
        }
    })
    res.status(201).send(observacoesdoLembrete);
});

app.get('/Lembretes/:id/Observacoes', (req, res) =>{
    res.send(observacoesPorLembreteId[req.params.id] || []);
});

app.post('/eventos', (req, res) =>{
    console.log(req.body);
    res.status(200).send({msg: 'ok'})
});

app.listen(5000, () => {console.log("Micro de observacoes. Porta 5000")
});