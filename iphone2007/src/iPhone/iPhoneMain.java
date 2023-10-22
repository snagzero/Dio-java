package iPhone;

import java.util.ArrayList;
import java.util.Scanner;

public class iPhoneMain {
    public static void main(String[] args) {

        int opcao = 4;
        Scanner scan = new Scanner(System.in);
        Iphone iphone = new iPhone(new ArrayList<>(), new ArrayList<>());

        System.out.println("Bem Vindo ao iOS");

        while (opcao != 0) {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("\n1.Telefone\n2.Navegador\n3.Reprodutor de Música\n0.Sair");
            System.out.print("\nDigite aqui: ");
            opcao = scan.nextInt();
            

            switch (opcao) {
                case 1:
                    //Aparelho Telefonico
                    System.out.println("\n---------------------------------------------");
                    System.out.println("                Telefone");
                    System.out.println("---------------------------------------------");

                    iphone.adicionarContato("Pablo", 91005335);
                    iphone.adicionarContato("Hallanah", 98522300);
                    iphone.adicionarContato("Tania", 91660733);

                    iphone.exibirContato();

                    iphone.realizarChamada("Hallanah");
                    iphone.desligarChamada();

                    iphone.atenderChamada(40028922);
                    iphone.desligarChamada();
                    System.out.println("\n---------------------------------------------");
                    break;
                case 2:
                    //Navegador Internet
                    System.out.println("\n---------------------------------------------");
                    System.out.println("                Navegador");
                    System.out.println("---------------------------------------------");

                    iphone.abriSite("www.google.com");
                    iphone.adicionarNovaAba("www.youtube.con");
                    iphone.atualizarPagina("www.youtube.com");
                    iphone.fecharPagina("www.google.com");
                    System.out.println("\n---------------------------------------------");
                    break;
                case 3:
                    //Reprodutor Musical
                    System.out.println("\n---------------------------------------------");
                    System.out.println("                Reprodutor");
                    System.out.println("---------------------------------------------");

                    iphone.adicionarMusica("Anos Luz", "Matuê");
                    iphone.adicionarMusica("Coração de Gelo", "Wiu");
                    iphone.adicionarMusica("Mustang Preto", "Teto");

                    iphone.selecionarMusica("Anos Luz");

                    iphone.tocarMusica("Anos Luz");
                    iphone.pularMusica();
                    iphone.tocarMusica("Coração de Gelo");
                    iphone.pausarMusica("Coração de Gelo");
                    iphone.pularMusica();
                    iphone.tocarMusica("Mustang Preto");
                    iphone.antecederMusica();
                    iphone.tocarMusica("Coração de Gelo");
                    System.out.println("\n---------------------------------------------");
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                System.out.println("\n---------------------------------------------");
                    System.out.println("             Opção Invalida");
                    System.out.println("---------------------------------------------");
                break;
            }
        }   
        scan.close();
    }
}   