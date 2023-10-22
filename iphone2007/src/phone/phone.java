//Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz

package phone;

public interface Phone {

    
    public void adicionarContato(String nome, int numero);

    public void exibirContato();

    public void realizarChamada(String nome);

    public void atenderChamada(int numero);

	public void desligarChamada();

}