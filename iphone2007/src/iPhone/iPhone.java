/*Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação 
das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial, Aparelho Telefônico e Navegador na Internet.
Em seguida crie as classes e interfaces no formato de arquivos .java

Lançamento iPhone 2007

Minutos relevantes do 00:15 até 00:55
Comportamentos esperados:
Repodutor Musicial: tocar, pausar, selecionarMusica
Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina*/

package iPhone;

import java.util.ArrayList;
import java.util.List;

import Browser.Safari;
import Phone.Phone;
import Phone.Contacts;
import Player.Music;
import Player.iTunes;

public class Iphone implements Telefone, Reprodutor, Navegador{

    //Atributos e Construtores

    private List<Contacts> contatoList; 
    private List<Music> musicaList;

    public Iphone(List<Contacts> contatoList, List<Music> musicaList) {
        this.contatoList = new ArrayList<>();
        this.musicaList = new ArrayList<>();
    }

    public List<Contato> getContatoList() {
        return contatoList;
    }

    public void setContatoList(List<Contato> contatoList) {
        this.contatoList = contatoList;
    }

    public List<Music> getMusicaList() {
        return musicaList;
    }

    public void setMusicaList(List<Music> musicaList) {
        this.musicaList = musicaList;
    }

    //AparelhoTelefonico

    @Override   
    public void adicionarContato(String nome, int numero) {
        this.contatoList.add(new Contato(nome, numero) );
    }

    @Override
    public void exibirContato() {
        System.out.println("\nLista de Contatos");
        System.out.println(contatoList);
    }

    @Override
    public void realizarChamada(String nome){
        
        Contato contatoChamado = null;

        if (!contatoList.isEmpty()) {
            for (Contato contato : contatoList) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contatoChamado = contato;
                    break;
                }
            }
        } 
        System.out.println("\nLigando para " + contatoChamado);
    }

    @Override
    public void atenderChamada(int numero) {
        System.out.println("\nAtendendo chamada de " + numero);
    }

    @Override
    public void desligarChamada() {
        System.out.println("\nDesligando chamada");
    }


    //Reprodutor Musical

    @Override
    public void adicionarMusica(String nome, String artista) {
        this.musicaList.add(new Musica(nome, artista));
    }

    @Override
    public void selecionarMusica(String nome) {

        Musica musicaSelecionada = null;

        if (!musicaList.isEmpty()) {
            for (Musica musica : musicaList) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    musicaSelecionada = musica;
                    break;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        System.out.println("\nMusica Selecionada: " + musicaSelecionada);
    }

    @Override
    public void tocarMusica(String nome) {
        Musica musicaSendoTocada = null;

        if (!musicaList.isEmpty()) {
            for (Musica musica : musicaList) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    musicaSendoTocada = musica;
                    break;
                }
            }
        } else {
            throw new RuntimeException("Essa música não está na playlist!");
        }
        System.out.println("\n" + musicaSendoTocada + " está tocando");
    }

    @Override
    public void pausarMusica(String nome) { 
        Musica musicaPausada = null;

        if (!musicaList.isEmpty()) {
            for (Musica musica : musicaList) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    musicaPausada = musica;
                    break;
                }
            }
        } else {
            throw new RuntimeException("Essa música não está na playlist!");
        }
        System.out.println("\n" + musicaPausada + " foi pausada");
    }

    @Override
    public void pularMusica() {
        System.out.println("\nPulando música");
    }

    @Override
    public void antecederMusica() {
        System.out.println("\nAntecedendo música");
    }


    //Navegador Internet
    @Override
    public void abriSite(String url) {
        System.out.println("\nAbrindo site " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("\nAdicionando nova aba de " + url);
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("\nAtualizando " + url);
    }

    @Override
    public void fecharPagina(String url){
        System.out.println("\nfechando " + url);
    }
   
}