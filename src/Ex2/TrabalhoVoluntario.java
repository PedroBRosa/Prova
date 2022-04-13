package Ex2;

public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duaracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duaracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duaracaoTrabalho = duaracaoTrabalho;
    }


    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuaracaoTrabalho() {
        return duaracaoTrabalho;
    }

    public void setDuaracaoTrabalho(int duaracaoTrabalho) {
        this.duaracaoTrabalho = duaracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        if (duaracaoTrabalho > 2) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do Projeto: "+getNomeProjeto()+"/n Descricao: "+getDescricao()+"/n Data Inicio: "+getDataInicio()+
                "/n Data Fim: "+getDataFim()+"/n Tipo de Trabalho: "+getTipoTrabalho()+"/n Duração Trabalho: "+getDuaracaoTrabalho();
    }
}
