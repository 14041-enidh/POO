
import java.util.Random;

/**
 * Gere um jogo em que o jogador lança um dado até atingir ou ultrapassar
 * a pontuação máxima definida.
 */

public class DiceGame {
    private int maxNum;
    private int numTentativas;
    private int pontAtual;
    private boolean jogoTerminado;
    private InputReader inputReader;

    /**
     * Cria um jogo com limite máximo inicial de 6 e estado reiniciado.
     */
    public DiceGame (){
        this.maxNum = 6;
        this.numTentativas = 0;
        this.pontAtual = 0;
        this.jogoTerminado = false;
        this.inputReader = new InputReader();
    }

    /**
     * Apresenta o limite máximo, o número de tentativas e a pontuação atual.
     */
    public void showPlay(){
        System.out.println("+--------------------------+");
        System.out.println("|       JOGO DE DADOS      |");
        System.out.println("+--------------------------+");
        System.out.println("Valor máximo = " + maxNum);
        System.out.println("Nº de tentativas = " + numTentativas);
        System.out.println("Pontuação atual = " + pontAtual);
    }

    /**
     * Lança um dado de seis faces.
     *
     * @return um valor aleatório entre 1 e 6, inclusive
     */
    public int rollDice(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    /**
     * Solicita ao utilizador a pontuação máxima permitida.
     * Se for introduzido 0, usa o valor predefinido de 6. Valores negativos
     * são solicitados novamente.
     *
     * @return a pontuação máxima escolhida
     */
    public int inputMaximumNumber(){
        int numero = inputReader.getIntegerNumber("Insira o número máximo permitido");
        if (numero == 0){
            numero = 6;
        }
        while (numero < 0){
            numero = inputReader.getIntegerNumber("Insira um número não negativo");
        }
        return numero;
    }

    /**
     * Executa o jogo e permite iniciar novas partidas.
     */
    public void play(){
        char repetir;
        do {
            numTentativas = 0;
            pontAtual = 0;
            jogoTerminado = false;
            maxNum = inputMaximumNumber();

            while (!jogoTerminado) {
                String action = inputReader.getText("Escreva JOGAR para jogar ou SAIR para sair");
                if ("JOGAR".equals(action) || "jogar".equals(action)) {
                    int numero = rollDice();
                    numTentativas++;
                    pontAtual += numero;
                    System.out.println("Saiu o valor " + numero + " no dado.");
                    showPlay();
                    if (pontAtual >= maxNum) {
                        System.out.println(pontAtual == maxNum
                                ? "Igualou o limite máximo. Jogo terminado."
                                : "Ultrapassou o limite máximo. Jogo terminado.");
                        jogoTerminado = true;
                    }
                } else if ("SAIR".equals(action) || "sair".equals(action)) {
                    jogoTerminado = true;
                } else {
                    System.out.println("Opção inválida.");
                }
            }

            repetir = inputReader.getCharacter("Novo jogo? (S/N)");
            while (repetir != 'S' && repetir != 's' && repetir != 'N' && repetir != 'n') {
                repetir = inputReader.getCharacter("Responda apenas S ou N");
            }
        } while (repetir == 'S' || repetir == 's');
    }

    /**
     * Obtém o limite máximo da pontuação.
     *
     * @return o limite máximo atual
     */
    public int getMaxNum() {
        return maxNum;
    }

    /**
     * Define o limite máximo da pontuação.
     *
     * @param maxNum novo limite máximo
     */
    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    /**
     * Obtém o número de tentativas realizadas.
     *
     * @return o número atual de tentativas
     */
    public int getNumTentativa() {
        return numTentativas;
    }

    /**
     * Define o número de tentativas realizadas.
     *
     * @param numTentativa novo número de tentativas
     */
    public void setNumTentativa(int numTentativa) {
        this.numTentativas = numTentativa;
    }

    /**
     * Obtém a pontuação atual.
     *
     * @return a pontuação atual
     */
    public int getPontAtual() {
        return pontAtual;
    }

    /**
     * Define a pontuação atual.
     *
     * @param pontAtual nova pontuação atual
     */
    public void setPontAtual(int pontAtual) {
        this.pontAtual = pontAtual;
    }

    /**
     * Verifica se o jogo terminou.
     *
     * @return {@code true} se o jogo terminou; {@code false} caso contrário
     */
    public boolean isJogoTerminado() {
        return jogoTerminado;
    }

    /**
     * Define se o jogo terminou.
     *
     * @param jogoTerminado {@code true} se o jogo terminou; {@code false} caso contrário
     */
    public void setJogoTerminado(boolean jogoTerminado) {
        this.jogoTerminado = jogoTerminado;
    }

    /**
     * Obtém o leitor de dados usado pelo jogo.
     *
     * @return o leitor de dados
     */
    public InputReader getInputReader() {
        return inputReader;
    }

    /**
     * Define o leitor de dados usado pelo jogo.
     *
     * @param inputReader leitor de dados a utilizar
     */
    public void setInputReader(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    

}
