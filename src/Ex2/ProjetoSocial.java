package Ex2;

import javax.swing.*;
import java.util.Scanner;

public class ProjetoSocial {
    public static void main(String[] args) {
        int menu=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("=============     MENU     =============");
        System.out.println("1 - Distribuição de Alimentos");
        System.out.println("2 - Trabalho Voluntario");
        System.out.println("3 - Sair");
        System.out.println("=======================================");
        System.out.println("Por gentileza escolha um menu de [1-3]:");
        System.out.println("=======================================");
        menu = ler.nextInt();
        switch (menu) {
            case 1:
                DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento("TesteNome","TesteDesc","TesteEndere","00/00"
                ,"","TesteDescAlimentos",2);
                JOptionPane.showMessageDialog(null, distribuicaoAlimento.validaProjeto("TesteNome"));
                break;

            case 2:
                TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario("TesteNome","TesteDesc","TesteEndere","00/00"
                        ,"00/00","TesteDescAlimentos",4);
                JOptionPane.showMessageDialog(null, trabalhoVoluntario.validaProjeto("TesteNome"));
                break;

            case 3:
                JOptionPane.showMessageDialog(null,"SISTEMA ENCERRADO!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "ENTRADA INVALIDA");
                break;
        }
    }
}
