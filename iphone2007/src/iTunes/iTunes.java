//Repodutor Musicial: tocar, pausar, selecionarMusica

package iTunes;

public interface iTunes {

    void adicionarMusica(String nome, String artista);

    void selecionarMusica(String nome);
    
    void tocarMusica(String nome);

	void pausarMusica(String nome);

    void pularMusica();

    void antecederMusica();


}