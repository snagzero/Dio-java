package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);*/
    }
    static void selecaoCandidatos() {

        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String canditado = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + canditado + " solicitou este valor de salatio" + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + canditado + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }     
    }
}