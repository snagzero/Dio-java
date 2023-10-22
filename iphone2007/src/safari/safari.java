//Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

package safari;

public interface Safari{
    
    public void abriSite(String url);

	public void adicionarNovaAba(String url);

	public void atualizarPagina(String url);

	public void fecharPagina(String url);

}