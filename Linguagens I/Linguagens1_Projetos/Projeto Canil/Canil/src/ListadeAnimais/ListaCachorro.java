package ListadeAnimais;

public enum ListaCachorro {

    //Cachorros
    Thor("Novo", "Golden Retriever"),
    Leko("Baby", "Corgi");





    private final String desc;
    private final String raca;

    ListaCachorro(String descricao, String rc) {
        desc = descricao;
        raca = rc;
    }

    public String getDesc(){
        return desc;
    }

    public  String getRaca(){
        return raca;
    }
}