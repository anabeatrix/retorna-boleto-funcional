/**
 * @author anabeatriz
 * Baseado no projeto disponível em:
 * https://github.com/manoelcampos/padroes-projetos/tree/master/comportamentais/strategy/retorno-boleto-funcional
 */

public class Principal {
    public static void main(String[] args) {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBrasil);
        //processador = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String nomeArquivo = "banco-brasil-1.csv";
        //nomeArquivo = "bradesco-1.csv";
        processador.processar(nomeArquivo);
    }
}
