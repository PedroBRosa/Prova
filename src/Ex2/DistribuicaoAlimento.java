package Ex2;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimentos;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimentos, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimentos = descAlimentos;
        this.qtde = qtde;
    }

    public String getDescAlimentos() {
        return descAlimentos;
    }

    public void setDescAlimentos(String descAlimentos) {
        this.descAlimentos = descAlimentos;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        if(getDataFim()==""){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: "+getNomeProjeto()+"/n Descricao: "+getDescricao()+"/n Data Inicio: "+getDataInicio()+
                "/n Data Fim: "+getDataFim()+"/n Descricao Alimento: "+getDescAlimentos()+"/n Qtde: "+getQtde();
    }
}
