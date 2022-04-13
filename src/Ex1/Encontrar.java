package Ex1;

public class Encontrar {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Pedro","pedro@teste.com","testeSenha");
        AchadoPerdido achadoPerdido = new AchadoPerdido("testeTitulo","testeD","testT","TesteS");
        achadoPerdido.completarDados("testeFoto","TesteLocal","TesteData");
        System.out.println(achadoPerdido.buscarTitulo("buscandoTitulo"));
        achadoPerdido.visualizarDetalhes();


    }
}
