import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To do: cohecer e importar a classe Scanner
        Scanner Input = new Scanner(System.in);

        String nomeCliente;
        String Agencia;
        int numeroConta;
        double Saldo;
        //String dadosCompletos = dadosCompletos (nomeDoCliente, Agencia, numeroDaConta, Saldo);

        //Exibir as mensagens para o usuario
        
        System.out.println("Por favor, digite o nome do usuário: ");
        nomeCliente = Input.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        Agencia = Input.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = Input.nextInt();
        
        System.out.println("Por favor, digite o saldo para saque: ");
        Saldo = Input.nextDouble();

        
        //Obter pela scanner os valores digitados no terminal

        //public static String dadosCompletos (String nomeDoUsuario, String Agencia, int numeroDaConta, double Saldo) {
        //    return nomeDoUsuario.concat(" ").concat(Agencia).concat (numeroDaConta).concat(Saldo);
        //}
            
;

        //Exibir a mensagem conta criada 

        System.out.print ("Olá "+nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ numeroConta +" e seu saldo "+ Saldo +" já está disponível para saque.");
        
    }
}
